package com.develop.oms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 *
 * @author 周成成
 * @create 2017-11-06 11:30
 * To change this template use File | Settings | Editor | File and Code Templates.
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "测试方法！";
    }
}
