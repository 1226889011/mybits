package com.mybatis.demo.mapper;

import com.mybatis.demo.model.TUser;
import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.common.Mapper;

public interface TUserMapper extends Mapper<TUser>, InsertListMapper<TUser> {
}