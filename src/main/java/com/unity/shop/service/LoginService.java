package com.unity.shop.service;

import java.util.List;
import java.util.Map;

import com.unity.shop.dao.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    
    @Autowired
    private UserMapper userMapper;

    public Map<String,Object> findUserById(Map<String,Object> param){
        return userMapper.findUserById(param);
    }

    public List<Map<String,Object>> getUsers(Map<String,Object> param){
        return userMapper.getUsers(param);
    }
}
