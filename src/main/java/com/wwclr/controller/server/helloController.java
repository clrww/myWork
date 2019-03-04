package com.wwclr.controller.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wwclr on 2019/3/4.
 */
@RestController
public class helloController {
    @RequestMapping("/")
    public Object sayHello(){
        return "hello spring haha";
    }
}
