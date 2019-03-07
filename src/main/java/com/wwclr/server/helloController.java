package com.wwclr.server;

import com.wwclr.entity.Student;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wwclr on 2019/3/4.
 */
//@Controller
@RestController  //这个=controller+responsebody
@RequestMapping("/student")
public class helloController {
    private static ExecutorService executorService=new ExecuterRegiste().getExecutor(Executors.newFixedThreadPool(2));
    private static Student student1;
    private static int jj=0;
//    public helloController(){
//        if(StringUtils.isEmpty(executorService)){
//            executorService=new ExecuterRegiste().getExecutor(Executors.newFixedThreadPool(1));
//        }
//    }

    @RequestMapping("/hello")
//    @ResponseBody
    public Student sayHello(){
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        });
        return student1;

    }


    @RequestMapping("/hello1")
//    @ResponseBody
       public Student sayHello1(){

        Student student2 = new Student("123", "wangwu2", jj++);
        System.out.println(jj);
        return student2;

    }

    @RequestMapping("/hello2")
//    @ResponseBody
    public Student sayHello2(){
        Student student3 = new Student("123", "wangwu2",  jj++);
        System.out.println(jj);
        return student3;

    }
}
