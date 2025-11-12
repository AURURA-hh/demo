package com.aaa.demo.service;

import com.aaa.demo.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 接口 UserService
 */
public interface UserService extends IService<User> {
    // 这里定义一个需要封装的方法作为示例
    String testUserRegister(String account, String password);
}