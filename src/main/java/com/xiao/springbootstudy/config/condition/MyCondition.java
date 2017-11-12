package com.xiao.springbootstudy.config.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

/**
 * Description:
 * User: xiaojixiang
 * Date: 2017/11/11
 * Version: 1.0
 */

@Component
public class MyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        //可以获取@Conditional注解的类中的 其他注解(如PojoConfig使用的@Configuration注解) 的属性
        //参考 OnJavaCondition

        MultiValueMap<String, Object> allAnnotationAttributes = metadata.getAllAnnotationAttributes(Configuration.class.getName());
        System.out.println(allAnnotationAttributes);

        if ("AA".equals(context.getEnvironment().getProperty("xiao.a"))) {
            return false;
        }
        return false;
    }
}
