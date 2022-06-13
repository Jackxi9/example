package com.gavin.service;

import com.gavin.po.User;

import java.util.List;

/**
 * @author gavin
 * @date 2021/5/18 11:19
 */
public interface UserService {

    public List<User> findUserAll();

    public User findById(Integer id);

}
