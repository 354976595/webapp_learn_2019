package com.learn.webapp.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.learn.webapp.mapper.base.BatisMapper;
import com.learn.webapp.mapper.user.UserMapper;
import com.learn.webapp.service.DoubleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DoubleServiceImpl implements DoubleService {
    @Resource
    private BatisMapper batisMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public String getString(String str) {
       return JSONObject.toJSONString(batisMapper.getList())+userMapper.getListCount();
    }

    @Override
    public int getAtMethod() {
        return batisMapper.testOc();
    }

    @Override
    public String getMe() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("rule_id",1);
        return JSONObject.toJSONString(userMapper.selectOne(queryWrapper));
    }
}
