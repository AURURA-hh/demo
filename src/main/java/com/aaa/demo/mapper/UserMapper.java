package com.aaa.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.aaa.demo.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {


}
