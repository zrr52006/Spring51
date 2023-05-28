package com.george.ui;

import com.george.factory.BeanFactory;
import com.george.services.UserServices;

/**
 * @author ：zhangrr
 * @date ：Created in 2023/5/28 15:58
 * @description：
 * @modified By：
 * @version:
 */
public class client {
    public static void main(String[] args) {
        //IAccountService as = new AccountServiceImpl();
        for(int i=0;i<5;i++) {
            UserServices as = (UserServices) BeanFactory.getBean("userService");
            System.out.println(as);
            as.saveUser();
        }
    }
}
