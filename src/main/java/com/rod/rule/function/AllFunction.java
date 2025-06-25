package com.rod.rule.function;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.type.AviatorBoolean;
import com.googlecode.aviator.runtime.type.AviatorObject;

import java.util.List;
import java.util.Map;

/**
 * 全部合格：all(rows, "合格表达式")
 */
public class AllFunction extends AbstractFunction {
    @Override
    public String getName() {
        return "all";
    }

    @Override
    public AviatorObject call(Map<String, Object> env, AviatorObject arg1, AviatorObject arg2) {
        List<Map<String, Object>> rows = (List<Map<String, Object>>) arg1.getValue(env);
        String expr = (String) arg2.getValue(env);
        for (Map<String, Object> row : rows) {
            Boolean hit = (Boolean) AviatorEvaluator.execute(expr, row);
            if (hit == null || !hit) {
                return AviatorBoolean.valueOf(false);
            }
        }
        return AviatorBoolean.valueOf(true);
    }
}
