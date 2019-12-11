package com.learn.webapp.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.learn.webapp.entity.Rule;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<Rule> {
    int getListCount();
}
