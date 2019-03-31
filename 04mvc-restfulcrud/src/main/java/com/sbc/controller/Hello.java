package com.sbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Hello {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }
    @RequestMapping("/success")
    public String success(Map m) {

        m.put("hello","你好！！！");
        return "test";
    }
}
