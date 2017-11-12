package com.xiao.springbootstudy.config;

import com.xiao.springbootstudy.config.condition.MyCondition;
import com.xiao.springbootstudy.pojo.UserPojo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * User: xiaojixiang
 * Date: 2017/11/10
 * Version: 1.0
 */

@Configuration
@Conditional({MyCondition.class})
public class PojoConfig {

    @Bean(name = "myUserPojo", initMethod = "init", destroyMethod = "destroy")
    public UserPojo getUser() {
        return new UserPojo();
    }
}
