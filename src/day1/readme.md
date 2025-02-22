### 封装 Encapsulate
1. class vs object: object是类的instance
2. 类的属性，行为称为封装
3. access modifier: private 类外部不可访问 public 外部可以访问
    - c++: public private
    - python: __private,非强制
    - getAttribute(), setAttribute()

### 继承 Inherits
1. is-a的关系
2. extends关键字 class Dog extends Animal
3. Dog继承了Animal的 非private的attr和method
    - override 重写方法，参数不变
    - overload 重载参数列表
    - 用的时候，输入不同的参数列表时，自动调用overload
    - super 调用父类的同名方法中的内容
    - final 不可变，不可继承
4. Abstract 抽象类 class不可实例化，func不提供具体方法，被继承的话必须实现抽象方法
5. Interface
    - 是一个约定 contract
    - implement 关键字，具有抽象函数的特性
    - 变相实现多继承


### 多态 Polymorphism
1. 同一个类，同一个方法，不同的输出
```java
public abstract class Animal(){
    public sound(){}
}

final class Dog extends Animal{
    public sound(){
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    public sound(){
        System.out.println("Meow");
    }
}
Animal dog = new Dog();
Animal cat = new Cat();
dog.sound();
cat.sound();
```

### Exception
1. uncheckException (runtime error)
2. checkException (IO)
3. 方法 throw Exception,意味着调用方法可能会抛出异常，要处理异常
    - 方法2 throw Exception  
    - 方法2 try catch Exception

### Enum
1. 有几种确定状态，就用enum，提升性能
2. 避免数字，可读性好，值是固定的，防止乱输入
3. 匹配switch, switch(TrafficSignal.RED)

## SOLID 原则
### 单一责任原则 Single responsibility
1. 一个类一件事，不要杂糅在一起，多写几行代码没关系

### 开闭原则，Open close principle
可以扩展 open to extension，不可修改 close to modification
- 实践：结合interface I 添加一个实现类A， B的b方法传入I,而不是A，这样就不需要修改B类的代码，又可以添加新的实现类implement I

### 里氏替换 liskov substitution principle
1. 亚洲人 extends 人， 机器人 extends 人 不合理 很牵强，人可以吃饭，机器人不能

### 接口分离原则 Interface segregation principle
1. 人 implements 吃，喝，拉，撒  ， 机器人 implements 吃喝拉撒，不合理
- 解决方式 分开设计Interface,细化细分，适用不同的类，反正多几行代码没事

### 依赖反转 dependency inversion principle
1. 具体实现的可以依赖抽象，但抽象的东西不能依赖具体实现，而应像开闭原则一样，将low-level的具体实现依赖high-level的对象

## 5C解题法
1. Clarify : What 有什么关键字, How，要跟面试官沟通需求，一步一步明确需求长啥样，不要闷头干到南辕北辙
2. Core Object: 核心类承上启下，上可，下可画类图
    - 线性Object ，我先写一个100%确定的类，然后线性思考，类的输入输出是什么
    - Object之间关系，一一对应，多对一，一对多，多对多
3. Cases
4. Class
5. Challenge

### UML
1. - access modifier
2. 避免用package level visible的变量 就是没有任何修饰符 int result;这样
3. `+` public JVM中的都可访问
4. `-` private 类中才能访问
5. `#` protected 只有子类能直接访问

### Use case
1. ElevatorSystem use case 
    - HandleExternalRequest
    - HandleInternalRequest
    - Open gate
    - Close gate
    - Check weight

### Class
1. 为什么要画类图
    - 可交付 Mini avaliable product
    - 可以不用挣扎coding,节省时间
    - 建立在use case上，条理清晰，便于交流和修改
    - 便于转为code如果时间允许

### 别忘记写Exception,又方便有能体验你的能力


### Challenge, 策略模式完善你的类
1. 加入多个策略，例如注入一个抽象类给 class ElevatorSystem 的 
    private HandleRequestStrategy strategy是一个接口，
    接口有两种实现，分别实现peak和normal的逻辑
2. 分装peak和normal，符合开闭原则，将来只需要改实现类，而不是动代码依赖关系
3. 有利于切换策略

