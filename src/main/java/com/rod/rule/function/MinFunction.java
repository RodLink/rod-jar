package com.rod.rule.function;

import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.type.AviatorDouble;
import com.googlecode.aviator.runtime.type.AviatorObject;

import java.util.List;
import java.util.Map;

/**
 * 作用：最小值
 * <p>
 * 表达式示例：
 * min(rows, 'actual_amount')
 * <p>
 * 含义：所有行中 XXX 字段的最小值
 */
public class MinFunction extends AbstractFunction {
    @Override
    public String getName() {
        return "min";
    }

    @Override
    public AviatorObject call(Map<String, Object> env, AviatorObject arg1, AviatorObject arg2) {
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> rows = (List<Map<String, Object>>) arg1.getValue(env);
        String field = (String) arg2.getValue(env);
        Double min = null;
        for (Map<String, Object> row : rows) {
            Object val = row.get(field);
            if (val instanceof Number) {
                double d = ((Number) val).doubleValue();
                if (min == null || d < min) {
                    min = d;
                }
            }
        }
        return AviatorDouble.valueOf(min == null ? 0 : min);
    }
}