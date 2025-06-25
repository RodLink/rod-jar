package com.rod.rule.function;

import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.type.AviatorDouble;
import com.googlecode.aviator.runtime.type.AviatorObject;

import java.util.List;
import java.util.Map;

/**
 * 作用：求和
 * <p>
 * 表达式示例：
 * sum(rows, 'actual_amount')
 * <p>
 * 含义：对所有行的 XXX 字段求和
 */
public class SumFunction extends AbstractFunction {


    @Override
    public String getName() {
        return "sum";
    }

    @Override
    public AviatorObject call(Map<String, Object> env,
                              AviatorObject arg1,
                              AviatorObject arg2) {
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> rows = (List<Map<String, Object>>) arg1.getValue(env);
        String field = (String) arg2.getValue(env);
        double total = 0;
        for (Map<String, Object> row : rows) {
            Object val = row.get(field);
            if (val instanceof Number) {
                total += ((Number) val).doubleValue();
            }
        }
        return AviatorDouble.valueOf(total);
    }
}
