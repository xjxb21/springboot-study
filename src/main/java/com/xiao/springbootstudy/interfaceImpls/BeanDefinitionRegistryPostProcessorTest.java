package com.xiao.springbootstudy.interfaceImpls;

import com.xiao.springbootstudy.pojo.UserPojo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Description: 使用BeanDefinitionRegistryPostProcessor可以动态注册Bean
 * User: xiaojixiang
 * Date: 2017/11/10
 * Version: 1.0
 */

@Component
public class BeanDefinitionRegistryPostProcessorTest implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

        for (int i = 0; i < 10; i++) {
            System.out.println("动态注册BEAN >>> postProcessBeanDefinitionRegistry >>> ");
            BeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(UserPojo.class).getBeanDefinition();
            registry.registerBeanDefinition("testUserPojo_" + i, beanDefinition);
        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        //参见 beanFactoryPostProcessorTest
    }
}
