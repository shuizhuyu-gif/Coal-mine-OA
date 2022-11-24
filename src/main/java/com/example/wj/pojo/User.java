package com.example.wj.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

//@Entity 表示这是一个实体类
//@Table(name=“user”) 表示对应的表名是 user
@Entity
@Table(name = "user")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    String username;
    String password;

//    获取id   username   password
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public  String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
