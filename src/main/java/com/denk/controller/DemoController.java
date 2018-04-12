package com.denk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: denk
 * desc:
 * date: 2018/4/12
 */
@RestController
public class DemoController {
    @RequestMapping("/demo")
    public String demo() {
        return "SUCCESS";
    }
}
