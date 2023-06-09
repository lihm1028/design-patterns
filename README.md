# design-patterns

# 设计模式类型：
创建型模式：单例模式、工厂方法、抽象工厂、建造者、原型模式.
结构性模式：适配器、桥接、组合、装饰、外观、享元、代理模式.
行为型对象模式：访问者、模板模式、策略模式、状态模式、观察者模式、备忘录模式、中介者模式、迭代器模式、解释器模式、命令模式、责任链模式.



# 桥接模式 (抽象和实现分离、具有多个维度的变化)
桥接设计模式是将抽象和实现部分分离，使他们都可以独立的变化。他是一种对接结构模式，又称为柄体模式或接口模式。
在软件系统中，某些类型由于自身的逻辑，它具有两个或多个维度的变化，那么如何应对这种“多维度的变化”？
如何利用面向对象的技术来使得该类型能够轻松的沿着多个方向进行变化，而又不引入额外的复杂度？这就要使用Bridge模式。
