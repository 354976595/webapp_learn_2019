package com.learn.webapp.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.learn.webapp.constract.StatusEnums;
import lombok.Data;

import java.io.Serializable;

@TableName("np_goods_rule")
@Data
public class Rule implements Serializable {
    @TableId(value = "rule_id")
    private Long ruleId;
    @TableField("rule_name")
    private String ruleName;
    @TableLogic
    private Integer status;

}
