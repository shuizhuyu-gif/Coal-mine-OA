package com.example.wj.error;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ErrorConfig implements ErrorPageRegistrar {
//    通过后端直接进行访问，路由错误直接返回唯一index
    @Override
    public  void registerErrorPages(ErrorPageRegistry registry){
        ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND,"/index.html");
        registry.addErrorPages(error404Page);

    }

}



