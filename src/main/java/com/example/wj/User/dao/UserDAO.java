package com.example.wj.User.dao;

import com.example.wj.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

//接口继承与jpa
public interface UserDAO extends JpaRepository <User,Integer>{

//  构造方法1：查询username
    User findByUsername(String username);
// 方法2：查询username和password
    User getByUsernameAndPassword(String username,String password);

}
