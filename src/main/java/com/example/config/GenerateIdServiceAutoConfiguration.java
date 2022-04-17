package com.example.config;

import com.example.service.GenerateIdService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author Javen
 * @date 2022/4/14
 */
@Configuration
@EnableConfigurationProperties(IdProperties.class)
public class GenerateIdServiceAutoConfiguration {

    private final IdProperties idProperties;

    public GenerateIdServiceAutoConfiguration(IdProperties idProperties) {
        this.idProperties = idProperties;
    }

    @Bean
    @Conditional(GenerateIdServiceEnable.class)
    @ConditionalOnMissingBean(GenerateIdService.class)
    public GenerateIdService generateIdService() {
        GenerateIdService generateIdService = new GenerateIdService();
        generateIdService.setIdProperties(idProperties);
        return generateIdService;
    }
}
