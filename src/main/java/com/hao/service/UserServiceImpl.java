package com.hao.service;

import com.hao.dao.UserDao;
import com.hao.dao.UserDaoImpl;

/**
 * @Describe com.hao.service
 * @Auther wenhao chen
 * @CreateDate 2019/7/28
 * @Version 1.0
 *
 */
public class UserServiceImpl implements UserService{

    //创建构造函数，debug，验证核心容器加载方式
    public UserServiceImpl(){
        System.out.println("userService实现类已经创建");
    }
    //改变默认构造函数，验证bean的创建方式
    /*
    public UserServiceImpl(String user){
        System.out.println("userService实现类已经创建");
    }
    */
    public void saveUser() {
        System.out.println("已保存");
    }

    public void init() {
        System.out.println("初始化");
    }
    public void destroy() {
        System.out.println("已销毁");
    }
}
