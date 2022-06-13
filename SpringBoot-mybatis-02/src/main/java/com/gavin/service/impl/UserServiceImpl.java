package com.gavin.service.impl;

import com.gavin.mapper.UserMapper;
import com.gavin.po.User;
import com.gavin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gavin
 * @date 2021/5/18 11:19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUserAll() {
        return userMapper.findUserAll();
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
