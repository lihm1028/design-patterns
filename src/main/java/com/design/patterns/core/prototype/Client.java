package com.design.patterns.core.prototype;

import java.util.Random;

/**
 * Created by lihongming on 16/6/21.
 */
public class Client {

    private static int Max_COUNT = 8;

    public static void main(String[] args) {
        //模拟发送邮件
        Template template = new AdvTemplate();
        int i = 0;
        Mail mail = new Mail(template);
        mail.setSubject("一个馒头引发的血案");
        mail.setContent("馒头很香，但为了安全，也要分着吃。");
        while (Max_COUNT > i++) {
            Mail clone = mail.clone();
            clone.setReceiver(getRandomString(5) + "@horse.com");
            clone.setAppellation(" 先生(女士)");
            sendMail(clone);
        }
    }


    public static void sendMail(Mail mail) {
        System.out.println("标题:" + mail.getSubject() + "\t" + mail.getAppellation() + ":" + mail.getContent() + "\t" + "收件人:" + mail.getReceiver() + "\t发送成功!");
    }


    public static String getRandomString(int maxLength) {
        String source = "abcdefqhijklmnopqrstuvwxyzABCDEFQHIJKLMNOPQRSTUVWXYZ";

        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
