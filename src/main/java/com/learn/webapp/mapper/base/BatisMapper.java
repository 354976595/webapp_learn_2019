package com.learn.webapp.mapper.base;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface BatisMapper {
     Object getList();
     @Select(value = "Select count(1) from np_goods_rule")
     @ResultType(value = Integer.class)
     Integer testOc();
}
