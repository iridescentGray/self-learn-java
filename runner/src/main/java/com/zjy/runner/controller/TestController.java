package com.learn.runner.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author learn
 * @date 2022/3/10
 */
@RestController()
public class TestController {

    @PostMapping("/get")
    public String test(@RequestBody String str) {
        System.out.println("任务被执行了");
        return "s:" + str;
    }

}
