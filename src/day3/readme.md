# 实物类
回顾：5C解题法

1. 难度：低
2. 频率：高
3. 考虑input , output是什么
4. Design pattern
    - Factory pattern
    - decorate pattern
    - state pattern

### Vending machine
1. What
    - what is key : the vending machine, the sell item
    - what is input : money $$$$
    - what is output: the choosed item
    - 颜色/重量/厂家 无所谓
    - vm大小考虑
    - 商品售罄怎么办
    - 支持的payment有哪些 ：策略设计模式
2. How 功能思考
    - how to select item to purchase? 

3. use cases
    - select item
    - insert coin
    - execute transaction
    - cancel transaction
    - refill items

### Classes
1. select item: 输入A1 输出价格
    - class VendingMachine
      - `-` List<Coin> coins
      - `-` List<Item> items
      - ~~`-` Map<String, Item> itemIdentifiers // A1-Coke~~
      - `+` float selectItem(String selection)
      - 坑：选择商品，返回这一个商品实例的价格，商品被售卖之后就会引发空的报错
      - `-` Map<String, List<Item>> stock
      - `-` Map<String, ItemInfo> itemIdentifiers
2. insert coin: 投币到vm
    - class VendingMachine
      - `-` void insertCoin(Coin c)

3. Execute transaction
    - get the current selection
    - compare the price and insert coins
    - if not enough money, throw and exception
    - else return item purchsed
    - return exchange
    - class VendingMachine
      - `-` itemInfo currentSelection
      - `-` List<Coin> currentCoins
      - `+` void insertCoins(List<Coin> coins)
      - ~~`+` Item executeTransaction() thows MoneyNotEnoughException~~
      - `+` Pair<Item, List<Coin>>executeTransaction() thows MoneyNotEnoughException
      - `-` List<Coin> refund //算法题
    - enum Coin
      - PENNIES
      - NICKELS
      - DIMES
      - QUARTERS
    
4. cancel transaction
    - class VendingMachine
      - `-` List<Coin> cancelTransaction()
5. refill item
    - class VendingMachine
      - `+` List<Item> refillItems(List<Item> items)

### Final view of class  
1. wrapper 复杂数据结构nest hashmap这种，可以用wrapper思想把具体的逻辑单独封装，调用时可以不关心具体逻辑


### Challenge
1. 你如何避免滥用if else防止意外的状况？
    - State design pattern 状态机模式
    - States:
      - HAS_SELECTION
      - NO_SELECTION
      - VENDING
      - COIN_INSERTED
    - Interface slelctio

## coffee maker


### decorator design pattern
1. 添加佐料到 class coffee,所有的不同风味coffee都继承了coffee
2. 装饰器给coffee添加不同的功能，但是coffee是同一个代码