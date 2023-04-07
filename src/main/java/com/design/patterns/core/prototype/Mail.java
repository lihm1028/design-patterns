package com.design.patterns.core.prototype;

/**
 * Created by lihongming on 16/6/21.
 */
public class Mail implements Cloneable {

    //接受人
    private String receiver;

    private String subject;

    //称谓
    private String appellation;

    private String content;

    public Mail(Template template) {
        this.subject = template.getSubject();
        this.content = template.getContent();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}
