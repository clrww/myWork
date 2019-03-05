package com.wwclr.controller.server;

import com.wwclr.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wwclr on 2019/3/4.
 */
//@Controller
@RestController  //这个=controller+responsebody
@RequestMapping("/student")
public class helloController {
    @RequestMapping("/hello")
//    @ResponseBody
    public Student sayHello(){
        Student student=new Student("123","wangwu",26);
       return student;

    }
}
