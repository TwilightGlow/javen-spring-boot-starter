package com.example.service;

import com.example.config.IdProperties;
import lombok.Data;

/**
 * @author Javen
 * @date 2022/4/14
 */
@Data
public class GenerateIdService {

    private IdProperties idProperties;

    public String getId() {
        return idProperties.getMachineId() + "-" + System.currentTimeMillis();
    }
}
