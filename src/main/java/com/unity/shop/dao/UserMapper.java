package com.unity.shop.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public Map<String,Object> findUserById(Map<String,Object> param);
    public List<Map<String,Object>> getUsers(Map<String,Object> param);
}
