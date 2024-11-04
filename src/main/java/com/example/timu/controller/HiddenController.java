package com.example.timu.controller;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Hidden
@RestController
@RequestMapping("/core-api-v1")
public class HiddenController {

    @GetMapping("/system-api/")
    public Map systemInfo() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("info","这是系统api");

        return map;
    }
    @GetMapping("/user-api/")
    public Map userInfo() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("info","这是用户api");

        return map;
    }
    @GetMapping("/test-api/")
    public Map testInfo() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("info","这是测试api");

        return map;
    }


}