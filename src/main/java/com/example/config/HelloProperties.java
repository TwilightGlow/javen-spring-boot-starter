package com.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Javen
 * @date 2022/4/14
 */
@Data
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

    private String prefix;
    private String suffix;
}
