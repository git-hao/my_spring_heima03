package com.hao.ui;

import com.hao.service.UserService;
import com.hao.service.UserServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @Describe com.hao.ui
 * @Auther wenhao chen
 * @CreateDate 2019/7/28
 * @Version 1.0
 * 模拟表现层，调用业务层
 */
public class Client {
    public static void main(String[] args){
            //获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //使用子类，调用close()方法,验证容器销毁时单例bean对象同时销毁
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
            //根据id获取bean对象
        UserService us = (UserService) ac.getBean("userService");
        us.saveUser();
        //调用ClassPathXmlApplicationContext的close()方法
        ac.close();
    }

}
