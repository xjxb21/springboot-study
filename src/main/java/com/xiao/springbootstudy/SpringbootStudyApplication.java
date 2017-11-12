package com.xiao.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootStudyApplication {

	public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringbootStudyApplication.class, args);

        System.out.println(context.getBean("myUserPojo").toString());
        //System.out.println(context.getBean(UserPojo.class).toString());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(context.getBean("testUserPojo_1").toString());
        System.out.println(context.getBean("testUserPojo_2").toString());
        System.out.println(context.getBean("testUserPojo_3").toString());
        System.out.println(context.getBean("testUserPojo_4").toString());

    }
}
