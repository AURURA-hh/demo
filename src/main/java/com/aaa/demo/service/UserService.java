package com.aaa.demo.service;

import com.aaa.demo.model.User;
import com.baomidou.mybatisplus.extension.service.IService;


public interface UserService extends IService<User> {
    // 这个接口现在也可以很干净，除非你有自定义的业务方法要在这里声明。
}