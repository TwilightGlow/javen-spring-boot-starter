package com.example.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Javen
 * @date 2022/4/14
 */
public class GenerateIdServiceEnable implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String property = context.getEnvironment().getProperty("id.enable");
        return "true".equalsIgnoreCase(property);
    }
}
