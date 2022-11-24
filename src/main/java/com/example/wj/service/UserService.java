package com.example.wj.service;

import com.example.wj.User.dao.UserDAO;
import com.example.wj.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
//Userservice 即是对userDao进行二次封装，
    @Autowired
    UserDAO userDAO;
    public boolean isExist(String username){
        User user = getByname(username);
        return null !=user;
    }

    public User getByname(String username) {
        return userDAO.findByUsername(username);
    }

    public User get(String username,String password){
        return userDAO.getByUsernameAndPassword(username,password);
    }

    public void add(User user){
        userDAO.save(user);
    }

}
