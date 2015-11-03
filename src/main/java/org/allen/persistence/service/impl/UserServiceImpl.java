package org.allen.persistence.service.impl;

import com.google.gson.Gson;
import org.allen.persistence.dao.user.UserDao;
import org.allen.persistence.domain.User;
import org.allen.persistence.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2015/10/25.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void insertUser(User user){
        userDao.insertUser(user);
    }

    public User findUserById(Long id) {
        return userDao.findUserById(id);
    }

    @Override
    public List<User> findUserByName(String name) {
        return userDao.findUserByName(name);
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = context.getBean(UserServiceImpl.class);
        User user = userService.findUserById(1L);
        System.out.println(new Gson().toJson(user));

        List<User> users = userService.findUserByName("allen");
        System.out.println(new Gson().toJson(users));
    }
}
