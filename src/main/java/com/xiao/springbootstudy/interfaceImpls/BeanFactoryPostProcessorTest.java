package com.xiao.springbootstudy.interfaceImpls;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Iterator;

/**
 * Description:
 * User: xiaojixiang
 * Date: 2017/11/10
 * Version: 1.0
 */

@Component
public class BeanFactoryPostProcessorTest implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println(">>>> postProcessBeanFactory count:" + beanFactory.getBeanDefinitionCount());
        Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
        while (beanNamesIterator.hasNext()) {
            System.out.println(">>>> postProcessBeanFactory >>> "+beanNamesIterator.next());
        }

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("myUserPojo");
        System.out.println(beanDefinition);
    }
}
