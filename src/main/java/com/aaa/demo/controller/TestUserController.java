package com.aaa.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aaa.demo.model.dto.TestRegisterRequest;
import com.aaa.demo.model.entity.User;
import com.aaa.demo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 用于展示的UserController 尽可能不深入涉及业务逻辑
 */
@RestController
public class TestUserController {

        // 这里需要引用，有两种不同的引用方式，我个人比较推荐后者

        // 1. 通过@Autowired注解自动注入UserService
        // @Autowired
        // private UserService userService;

        // 2. 通过构造函数注入UserService
        private final UserService userService;

        public TestUserController(UserService userService) {
                this.userService = userService;
        }

        // 1.1 简单调用 UserService 的方法
        @GetMapping("/test/createUser")
        public void testCreateUser() {
                // 创建一个新的 User 对象
                User user = new User();
                // 调用 UserService 的 save 方法将用户保存到数据库
                boolean save = userService.save(user);
                // 打印一个创建成功日志
                if (save) {
                        System.out.println("用户创建成功，ID：" + user.getId());
                } else {
                        System.out.println("用户创建失败");
                }
        }

        // 1.2 实现用户注册 因为基本上这种请求是发送表单信息的，所以用POST比较合适
        @PostMapping("/test/register")
        public void testRegisterUser(@RequestBody String account,@RequestBody String password){ {
                // 依旧创建一个User对象     
                User user = new User();
                user.setAccount(account);
                user.setPassword(password);
                // 调用 UserService 的 save 方法将用户保存到数据库
                boolean save = userService.save(user);
                // 打印一个创建成功日志
                if (save) {
                        System.out.println("用户注册成功，ID：" + user.getId());
                } else {
                        System.out.println("用户注册失败");
                }
        } }
        
        // 1.2.2 实现用户注册 因为基本上这种请求是发送表单信息的，所以用POST比较合适  这里整合了account和password
        @PostMapping("/test/register")
        public void testRegisterUser(@RequestBody TestRegisterRequest registerRequest){ {
                // 依旧创建一个User对象     
                User user = new User();
                user.setAccount(registerRequest.getAccount());
                user.setPassword(registerRequest.getPassword());
                // 调用 UserService 的 save 方法将用户保存到数据库
                boolean save = userService.save(user);
                // 打印一个创建成功日志
                if (save) {
                        System.out.println("用户注册成功，ID：" + user.getId());
                } else {
                        System.out.println("用户注册失败");
                }
        } }

        // 1.2.3 实现用户注册 调用封装好的UserService方法
        @PostMapping("/test/register")
        public void testRegisterUserViaService(@RequestBody TestRegisterRequest registerRequest){ {
                String result = userService.testUserRegister(registerRequest.getAccount(), registerRequest.getPassword());
                System.out.println(result);
        } }
}
