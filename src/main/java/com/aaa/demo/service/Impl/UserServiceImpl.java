package com.aaa.demo.service.Impl;

import com.aaa.demo.mapper.UserMapper;
import com.aaa.demo.model.User;
import com.aaa.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
