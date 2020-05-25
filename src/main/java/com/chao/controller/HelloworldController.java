package com.chao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* User: lohvc
 * \* Date: 2020/5/25
 * \* Time: 9:28
 * \
 */
@RestController
public class HelloworldController {
    @RequestMapping("/HelloWorld")
    public String showHello(){
        return "hellolwc";
    }
}
