package com.xiao.springbootstudy.interfaceImpls;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Description: Spring 创建BEAN时调用
 * User: xiaojixiang
 * Date: 2017/11/10
 * Version: 1.0
 */

@Component
public class BeanPostProcessorImplTest implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("测试 >>>>> BeanPostProcessorImplTest postProcessBeforeInitialization >>> " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("测试 >>>>> BeanPostProcessorImplTest postProcessAfterInitialization >>>" + beanName);
        return bean;
    }
}
