package com.aaa.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.aaa.demo.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * Mapper 接口，负责 User 实体类与数据库的交互  本身用了MyBaits-Plus框架 所以这里的简单业务不需要自己来写了
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
