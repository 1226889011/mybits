package com.mybatis.demo.service;

import org.apache.catalina.User;

import java.util.List;

public interface UserService {


        int addUser(User user);

        List<User> findAllUser(int pageNum, int pageSize);

}
