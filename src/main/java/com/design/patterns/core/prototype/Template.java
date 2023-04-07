package com.design.patterns.core.prototype;

/**
 * Created by lihongming on 16/6/21.
 */
public interface Template {

    /**
     * 邮件主体
     *
     * @return
     */
    String getSubject();

    /**
     * 邮件内容
     *
     * @return
     */
    String getContent();
}
