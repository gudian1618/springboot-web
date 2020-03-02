package com.github.gudian1618.springbootwebjsp.service;

import com.github.gudian1618.springbootwebjsp.pojo.User;

import java.util.List;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/2/29 9:53 下午
 */

public interface UserService {

    List<User> findAll();

}

