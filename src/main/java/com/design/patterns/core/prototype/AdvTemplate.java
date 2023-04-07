package com.design.patterns.core.prototype;

/**
 * Created by lihongming on 16/6/21.
 */
public class AdvTemplate implements Template {


    /**
     * 邮件标题
     */
    private String subject = "6月份积分活动";

    /**
     * 邮件内容
     */
    private String content = "消费满100送1万积分";

    @Override
    public String getSubject() {
        return this.subject;
    }

    @Override
    public String getContent() {
        return this.content;
    }
 
}
