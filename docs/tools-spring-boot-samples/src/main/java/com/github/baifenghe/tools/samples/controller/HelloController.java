package com.github.baifenghe.tools.samples.controller;

import com.github.baifenghe.tools.annotation.ParamsCheck;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bfh
 * @since 2018/12/31
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    @ParamsCheck(params = "name")
    public String hello(String name) {
        return "hello， " + name;
    }
}
