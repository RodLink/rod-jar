package com.rod.entity.DO;

import lombok.Data;

import java.util.Date;

@Data
public class DecisionRuleDO {
    private Long id;
    private Long taskId;
    private String ruleName;
    private String ruleType;
    private String expression;
    private String groupByField;
    private String aggFunc;
    private String thresholdValue;
    private String scriptLanguage;
    private Boolean enabled;
    private String description;
    private String notifyType;
    private String notifyUserIds;
    private String notifyTemplate;
    private String severity;
    private String extraJson;
    private String creator;
    private Date createTime;
    private String updater;
    private Date updateTime;
    private Integer jobId;

}

