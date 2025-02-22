# 棋牌类

### Clarify
- 玩家： Player之间的区别
- 玩家信息：可能不需要
- 规则是什么：问面试官

### Core Object
1. TicTokToe
2. Board
3. Player

### Use case

1. initialise
    - 2D array
2. play:
    - move: 
      - 下棋：x,y, currentMove
      - 平局结束，赢了结束
      - 继续换手
3. win-lose-check:
    - rest board if full
    - if O win
    - if X win