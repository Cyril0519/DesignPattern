# 原型模式
## 原型模式包含如下角色：
抽象原型类：规定了具体原型对象必须实现的的 clone() 方法。
具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
访问类：使用具体原型类中的 clone() 方法来复制新的对象。

## 使用场景
对象的创建非常复杂，可以使用原型模式快捷的创建对象。
性能和安全要求比较高。