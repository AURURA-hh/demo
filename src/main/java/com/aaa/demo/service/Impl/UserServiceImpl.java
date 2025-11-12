package com.aaa.demo.service.Impl;

import com.aaa.demo.mapper.UserMapper;
import com.aaa.demo.model.entity.User;
import com.aaa.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 对应 UserService 接口的实现类
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
        void sampleMethod() {
                // 示例方法
                User user = new User();
                this.save(user); // 保存到数据库中，保存的数据是一个空的 User 对象，此时 id 会自动生成
        }

        // 这里是方法的实现
        @Override
        public String testUserRegister(String account, String password) {
                // 依旧创建一个User对象     
                User user = new User();
                user.setAccount(account);
                user.setPassword(password);
                // 调用 UserService（this） 的 save 方法将用户保存到数据库
                boolean save = this.save(user);
                // 打印一个创建成功日志
                if (save) {
                        return ("用户注册成功，ID：" + user.getId());
                } else {
                        return ("用户注册失败");
                }
        }
}
