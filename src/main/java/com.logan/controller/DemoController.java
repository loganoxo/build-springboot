package com.logan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author logan
 * @version 1.0
 * @date 2022/5/14
 * @description TODO
 */
@RestController
public class DemoController {

    @GetMapping("/get")
    public String get() {
        return "hello22";
    }

}