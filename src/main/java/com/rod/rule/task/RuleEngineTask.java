package com.rod.rule.task;


import com.alibaba.fastjson.JSONObject;
import com.googlecode.aviator.AviatorEvaluator;

import com.rod.entity.DO.DecisionRuleDO;
import com.rod.entity.constant.Constants;
import lombok.extern.slf4j.Slf4j;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class RuleEngineTask {

    public boolean runRuleEngine(DecisionRuleDO rule, List<Map<String, Object>> rows) {
        log.info("RuleEngineTask#runRuleEngine->rule:{},rows:{}", JSONObject.toJSONString(rule), JSONObject.toJSONString(rows));
        String expr = rule.getExpression();
        Map<String, Object> env = new HashMap<>();
        env.put(Constants.ROWS, rows);
        // 如果是单行判断（ROW），仍走 Aviator 每行逐条判断
        if (Constants.ROW.equalsIgnoreCase(rule.getRuleType())) {
            for (Map<String, Object> row : rows) {
                if (Boolean.TRUE.equals(AviatorEvaluator.execute(expr, row))) {
                    return true;
                }
            }
            return false;
        }
        if (Constants.SCRIPT.equalsIgnoreCase(rule.getRuleType())) {
            String lang = rule.getScriptLanguage();
            if (Constants.PYTHON.equalsIgnoreCase(lang)) {
                try (PythonInterpreter interpreter = new PythonInterpreter()) {
                    // 当前默认只取首行数据，可根据实际调整
                    interpreter.set("data", rows.get(0));
                    // 执行脚本（expr需含 result=xxx）
                    interpreter.exec(expr);
                    PyObject result = interpreter.get(Constants.RESULT);
                    // 判断 Python 中 result 的布尔值
                    return result.__nonzero__();
                } catch (Exception e) {
                    throw new RuntimeException("Python脚本执行失败: " + e.getMessage(), e);
                }
            } else {
                // 默认回退 Aviator 作为 fallback
                Object result = AviatorEvaluator.execute(expr, env);
                return Boolean.TRUE.equals(result);
            }
        }

        // 非脚本类规则（如 AGG、GROUP、all、any 等）继续走 Aviator
        Object result = AviatorEvaluator.execute(expr, env);
        return Boolean.TRUE.equals(result);
    }
}
