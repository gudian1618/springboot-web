package com.github.gudian1618.springbootwebjsp.service;

import com.github.gudian1618.springbootwebjsp.mapper.UserMapper;
import com.github.gudian1618.springbootwebjsp.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/2/29 9:54 下午
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

}
