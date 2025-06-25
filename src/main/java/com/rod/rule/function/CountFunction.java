package com.rod.rule.function;


import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.type.AviatorDouble;
import com.googlecode.aviator.runtime.type.AviatorObject;

import java.util.List;
import java.util.Map;

/**
 * 作用：非空数量统计
 * <p>
 * 表达式示例：
 * count(rows, 'order_no')
 * <p>
 * 含义：所有行里 XXX 字段非空的行数
 */
public class CountFunction extends AbstractFunction {
    @Override
    public String getName() {
        return "count";
    }

    // 统计总行数
    @Override
    public AviatorObject call(Map<String, Object> env, AviatorObject arg1) {
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> rows = (List<Map<String, Object>>) arg1.getValue(env);
        int count = rows != null ? rows.size() : 0;
        return AviatorDouble.valueOf(count);
    }

    // 统计某字段非空行数
    @Override
    public AviatorObject call(Map<String, Object> env, AviatorObject arg1, AviatorObject arg2) {
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> rows = (List<Map<String, Object>>) arg1.getValue(env);
        String field = (String) arg2.getValue(env);
        int count = 0;
        if (rows != null) {
            for (Map<String, Object> row : rows) {
                if (row.get(field) != null) {
                    count++;
                }
            }
        }
        return AviatorDouble.valueOf(count);
    }
}

