package com.example.service;

import com.example.config.HelloProperties;
import lombok.Data;

/**
 * @author Javen
 * @date 2022/4/14
 */
@Data
public class HelloService {

    private HelloProperties helloProperties;

    public String sayHello(String name) {
        return helloProperties.getPrefix() + " " + name + " " + helloProperties.getSuffix();
    }
}
