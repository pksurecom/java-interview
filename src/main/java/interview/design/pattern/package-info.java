/**
 * Created by pksure on 16/9/13.
 * 转载: http://blog.csdn.net/lhy_ycu/article/details/40031567
 *
 * 设计模式分类:
 *   1. 创建型(Creator)模式（共5种）  ：单例、原型、建造者、工厂方法、抽象工厂。
 *   2. 结构型(Structure)模式（共7种）：适配器、代理、外观、桥接、组合、享元、装饰者。
 *   3. 行为型(Behavior)模式（共11种）：策略、观察者、模板方法、迭代器、责任链、命令、备忘录、状态、访问者、中介者、解释器。
 *
 * 其中:
 * 1、创建型(Creator)模式（共5种）:
 *   ①单例(Singleton) ：是一种常用的设计模式。在Java应用中，单例对象能保证在一个JVM中，该对象只有一个实例存在。实现方式主要有饿汉式和懒汉式两种。
 *   ②原型(Prototype) ：该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。实现方式主要有浅复制和深复制两种。浅复制的关键是super.clone()；而深复制，需要采用二进制流的形式写入当前对象，再对其进行读取。
 *   ③建造者(Builder) ：该模式是将各种产品集中起来进行管理。将很多功能集成到一个类里，这个类可以创造出比较复杂的东西。它关注的是创建复合对象，多个部分。
 *   ④工厂方法(Factory method) ：调用工厂里的方法来生产对象(产品)的。它有3种实现方式：1)普通工厂模式：就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建)。2)多个工厂方法模式：是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。3)静态工厂方法模式：将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。如果你想使用工厂方法模式可以优先选择：静态工厂方法模式。
 *   ⑤抽象工厂(Abstract factory) ：顾名思义，就是把工厂抽象出来，不同的工厂生产不同的产品。
 *
 */
package interview.design.pattern;