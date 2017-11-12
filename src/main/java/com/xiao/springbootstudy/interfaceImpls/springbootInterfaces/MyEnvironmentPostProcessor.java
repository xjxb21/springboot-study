package com.xiao.springbootstudy.interfaceImpls.springbootInterfaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;

/**
 * Description:自定义环境
 * User: xiaojixiang
 * Date: 2017/11/11
 * Version: 1.0
 */

@Configuration
@SpringBootConfiguration
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {

        //可以编程式添加
        try {
            MutablePropertySources propertySources = environment.getPropertySources();
            propertySources.addLast(new ResourcePropertySource("my", "classpath:xiao.txt"));
            //environment.getPropertySources().get("my").getProperty("xiao.a");
            System.out.println(environment.getProperty("my"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
