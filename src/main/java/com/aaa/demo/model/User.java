package com.aaa.demo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.time.LocalDateTime;

@Data // Lombok 注解：自动为你生成 get/set/toString 等方法
@TableName("users") // MyBatis-Plus 注解：告诉框架这个类对应数据库中的 `users` 表
public class User {

    @TableId(type = IdType.AUTO) // 标记这是主键，并且是自增类型
    private Long id;

    private String username;
    private String password;
    private String nickname;
    private String email;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

}
