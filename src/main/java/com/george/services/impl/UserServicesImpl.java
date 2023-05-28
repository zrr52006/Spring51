package com.george.services.impl;

import com.george.dao.UserDao;
import com.george.factory.BeanFactory;
import com.george.services.UserServices;

/**
 * @author ：zhangrr
 * @date ：Created in 2023/5/28 15:50
 * @description：
 * @modified By：
 * @version:
 */
public class UserServicesImpl  implements UserServices {
    private UserDao accountDao = (UserDao) BeanFactory.getBean("userDao");

    public void saveUser() {
        int i = 1;
        accountDao.saveUser();
        System.out.println(i);
        i++;
    }
}
