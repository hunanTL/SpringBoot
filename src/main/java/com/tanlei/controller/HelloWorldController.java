package com.tanlei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-12-18 21:28
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String getHello(){
        return "hello World";
    }
}
