## 管理类 难度中等
- Gym
- parking lot
- restaurant

### Parking Lot
- what : parking lot, viechal
- input: viechal
- output: 
- usesCase: 通常的3个方面， reserve, serve, checkout,3个阶段分别每个阶段做什么case
- 用 receipt形式来设计 类图

### 管理什么 Clarify

vehicle --> parking lot --> parking spot

哪种 vehicle： 大车，小车
哪些 种类的parking lot： 露天，多层，上下
哪些种类的spot：充电车位

先问面试官达成一致再行动

how: parking lot 如何停车，统一横向/专属车位，收费/免费？ 按天收费？也需要clarify


### core object
input : 大车，小车，摩托车
output: 车位
receipt: 停车ticket记录停车位置和时间


### use case
1. 站在管理员的角度思考
2. 管理员结合三个方向考虑
      - reserve： 可以问面试官，需要预定服务吗？（其实预定是另外一个大类，面试官一般会说不需要，如果需要，正好又可以表现一番）
      - serve： getAvailableCount, park Vehicle
      - checkout: clearSpot + calculatePrice

### class
1. class ParkingLot
   - `-` list<Level> level
   - `-` float hourlyRates
   - `+` int getAvailableCount()
   - `-` List<Spot> findSportsForVehicle(Vehicle vehicle) //私有的辅助函数，用于获取可用的spot
   - `+` Ticket parkVehicle(Ticket t)
   - `+` float calculatePrice(Ticket t)
   -  `-` void clearSpot(Ticket t)
   
2. class Level
   - `-` list <Spot> spots
   - `- `int availableCount
   - int AvailableCount()

3. class Spot
   - `-` boolean available
   - `-` Level I
   - `+` boolean IsAvailable()
   - `+` void leaveSpot()
   - `+` void takeSpot()
   
4. class Car implements Vehicle
5. class Bus implements Vehicle
6. class motorcycle implements Vehicle
7. Interface Vehicle //不需要spot信息
   - `#` int size
   - `+` int getSize()

8. class Ticket //存储动态信息 Best practice
   - `-` Vehicle vehicle
   - `-` List<Spot> spots
   - `-` Time startTime

#### correctness
1. validate use case检查
2. 有没有遵循最佳实践，access modifier，Exception
   - Exception
3. 有没有违背SOLID原则，不属于的方法，不合理的继承，通用的方法
4. design pattern


### parking lot in action
1. 代入数据检查
2. 显得思路清晰，也让面试官看到你的思路


## Design Pattern
1. Singleton
   - 第一种，内部实例化，if _instance==null 创建，这种方式，有个问题，就是无法确保多线程时的单例！加入synchrized关键字，通过线程锁等待机制，但是这样就会很慢
   - 第二种，static final 静态内部类替换原来的实例创建过程

2. law of Demeter: 调用要直观，不要调用中间环节，如果太多getXX(),就有可能不够直观
   - obj.getA().getB().getC().doSomething()， 中间环节没必要，要考虑类设计的可能不合理
   - obj.doSomething() 