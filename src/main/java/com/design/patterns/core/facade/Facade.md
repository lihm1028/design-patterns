
# Facade

提供统一的接口去访问多个子系统的多个不同的接口

门面模式，是指提供一个统一的接口去访问多个子系统的多个不同的接口，它为子系统中的一组接口提供一个统一的高层接口。使得子系统更容易使用。


# 10.外观模式 
# 1.什么是外观模式
外观模式:也叫门面模式，隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接
口。
它向现有的系统添加一个接口，用这一个接口来隐藏实际的系统的复杂性。
使用外观模式，他外部看起来就是一个接口，其实他的内部有很多复杂的接口已经被实现

# 2.外观模式例子
用户注册完之后，需要调用阿里短信接口、邮件接口、微信推送接口。
