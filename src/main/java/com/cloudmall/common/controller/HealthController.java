package com.cloudmall.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HealthController {
    @GetMapping("/api/v1/health")
    public Map<String,Object> health(){
        Map<String, Object>result =
                new LinkedHashMap<>();
        result.put("code", 200);
        result.put("message", "CloudMall is running");
        result.put("success", true);

        return result;

   }
}
