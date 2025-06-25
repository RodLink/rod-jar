package com.rod.rule.function;

import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.type.AviatorDouble;
import com.googlecode.aviator.runtime.type.AviatorObject;

import java.util.List;
import java.util.Map;

/**
 * 用途：统计满足特定条件的数量（如“不合格数”/“异常数”/“合格数”）。
 * <p>
 * 用法：countIf(rows, 'status', '异常')
 */
public class CountIfFunction extends AbstractFunction {
    @Override
    public String getName() {
        return "countIf";
    }

    @Override
    public AviatorObject call(Map<String, Object> env, AviatorObject arg1, AviatorObject arg2) {
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> rows = (List<Map<String, Object>>) arg1.getValue(env);
        String condition = (String) arg2.getValue(env);
        int count = 0;
        if (rows != null) {
            for (Map<String, Object> row : rows) {
                // 把每一行的字段作为变量传给条件表达式
                Object pass = com.googlecode.aviator.AviatorEvaluator.execute(condition, row);
                if (Boolean.TRUE.equals(pass)) {
                    count++;
                }
            }
        }
        return AviatorDouble.valueOf(count);
    }

}

