package com.hao.factory;

import com.hao.service.UserService;
import com.hao.service.UserServiceImpl;

/**
 * @Describe com.hao.factory
 * @Auther wenhao chen
 * @CreateDate 2019/7/28
 * @Version 1.0
 * 模拟一个工厂类，可能存在jar中，无法通过修改源码的方式提供默认构造函数
 */
public class StaticInstanceFactory {

    public static UserService getUserService(){
        System.out.println("--静态方法调用--");
        return new UserServiceImpl();
    }
}
