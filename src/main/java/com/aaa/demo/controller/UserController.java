package com.aaa.demo.controller;

import com.aaa.demo.model.dto.UserLoginRequest;
import com.aaa.demo.model.entity.User;
import com.aaa.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController // 这是一个特殊的 Controller，它的所有方法默认返回 JSON 数据。
@RequestMapping("/api/users") // 为这个控制器下的所有 API 设置一个统一的基础路径
public class UserController {

     // 同样，自动注入 UserService 的实例
    @Autowired
    private UserService userService;

    /**
     * API 1: 获取所有用户
     * - HTTP 方法: GET
     * - URL: /api/users
     */
    @GetMapping
    public List<User> getAllUsers() {
        return null;
    }

    /**
     * API 2: 根据 ID 获取单个用户
     * - HTTP 方法: GET
     * - URL: /api/users/{id}  (例如 /api/users/1)
     * @PathVariable("id") 会将 URL 中的 {id} 值赋给 long userId
     */
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId) {
        return null;
    }

    /**
     * API 3: 创建新用户  首要目标
     * - HTTP 方法: POST
     * - URL: /api/users
     * @RequestBody 会将请求体中的 JSON 数据自动转换成 User 对象
     */
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return null;
    }

    /**
     * 用户登录接口
     * - HTTP 方法: POST
     * - URL: /api/users/login
     * @param userLoginRequest
     * @return
     */
    @PostMapping("/login")
    public long userLogin(@RequestBody UserLoginRequest userLoginRequest) {
        //TODO: process POST request
        
        return 0L;
    }
    

    /**
     * API 4: 更新用户信息
     * - HTTP 方法: PUT
     * - URL: /api/users/{id}
     */
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        return null;
    }

    /**
     * API 5: 删除用户
     * - HTTP 方法: DELETE
     * - URL: /api/users/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        return null;
    }
}

