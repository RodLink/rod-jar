package com.rod.config;

import com.googlecode.aviator.AviatorEvaluator;
import com.rod.rule.function.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AviatorFunctionConfig {
    @PostConstruct
    public void registerFunctions() {
        AviatorEvaluator.addFunction(new SumFunction());
        AviatorEvaluator.addFunction(new AvgFunction());
        AviatorEvaluator.addFunction(new MinFunction());
        AviatorEvaluator.addFunction(new MaxFunction());
        AviatorEvaluator.addFunction(new CountFunction());
        AviatorEvaluator.addFunction(new AllFunction());
        AviatorEvaluator.addFunction(new AnyFunction());
        AviatorEvaluator.addFunction(new CountIfFunction());
    }
}

