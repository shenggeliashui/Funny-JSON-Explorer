# Design Pattern 1


## 作业要求

基于上述需求描述和领域模型，按照设计模式要求，进行软件设计，并编码实现（任何语言均可）。

### 设计模式

使用**工厂方法**（Factory）、**抽象工厂**（Abstract Factory）、**建造者**（Builder）模式、**组合模式**（Composition），完成功能的同时，使得程序易于扩展和维护。

1. （必做）：不改变现有代码，只需添加新的抽象工厂，即可添加新的风格
2. （选做）：通过配置文件，可添加新的图标族



## 类图和说明
![image-20240612184841486](https://github.com/shenggeliashui/Funny-JSON-Explorer/assets/128944650/0cfbc7d7-caef-4463-af40-9146c884fda8)





## 使用的设计模式和作用

### 建造者（builder）模式

复杂对象被拆解成多个部分，组合经常变化，通过director来进行建设。

结构：

**Director：**class FactoryProducer：将Icons和Facotry的进行组合（起码四种情况），将用户的请求进行传递。

**Builder：**class Icons和class AbsFacotry

**ConcreteBuilder：**class FlowerIcons和class PokerIcons、class RectStyleFactory和class TreeStyleFactory。

**Producer：**class Container和Icons（由于Icons过于简单，所以其实相当于省去builder/合并builder）





### 工厂方法和抽象工厂

提供一个创建一系列相关或互相依赖对象的接口，而无需指定它们具体的类。这使得把对象的实例化交给了子类，即支持拓展。提供给客户端接口，避免了用户直接操作子类工厂。

**AbstractFactory（抽象工厂）**：class AbsFacotry  。规范了抽象产品的创建操作。

**ConcreteFactory（具体工厂）**：class RectStyleFacotry 和 class TreeStyleFacotry ，实现创建具体产品对象的操作。

**AbstractProduct（抽象产品）**：class Container。声明和规范产品对象。

**ConcreteProduct（具体产品）**：class TreeContainer和class RectContainer。实现具体工厂创建的具体产品对象。



### 组合模式

**Component(组件)**：class node.为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。

**Leaf(叶子节点)**：组合中的叶子节点对象，叶子节点没有子节点。

**Composite(复合节点)：**组合中的叶子节点对象，叶子节点没有子节点。在这里叶子节点和复合节点用同一个类表示，通过isLeaf区分。



## 添加新的风格

不改变现有代码，只需添加新的抽象工厂，即可添加新的风格。

假设需要添加新的风格StyleA。只需要创建对应的具体工厂StyleAFactory----->创建对应的产品StyleAContainer------>创建对应的节点ANode，进行A风格的实现即可。

因为StyleAFactory继承于AbsFactory、StyleAContainer继承于Container、ANode继承于Node，无需修改现有代码，且需要的都不难。



## 运行截图

4种：

1.![image-20240612190614051](https://github.com/shenggeliashui/Funny-JSON-Explorer/assets/128944650/8ca9142f-5308-4704-9812-848f1db3ff13)


2.![image-20240612190614051](https://github.com/shenggeliashui/Funny-JSON-Explorer/assets/128944650/97468075-cf75-421d-96e3-7db6e8ad6026)


3.![image-20240612190614051](https://github.com/shenggeliashui/Funny-JSON-Explorer/assets/128944650/b569e17c-388c-4cc5-8684-143b4290c400)


4.![image-20240612190942091](https://github.com/shenggeliashui/Funny-JSON-Explorer/assets/128944650/5f6f880b-0aac-4905-bf63-c687fcd39d73)
