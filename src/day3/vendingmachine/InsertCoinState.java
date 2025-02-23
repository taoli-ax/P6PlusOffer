package day3.vendingmachine;

import java.util.List;

public class InsertCoinState implements State{
    VendingMachine vendingMachine;
    public InsertCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void selectItem(String item) {
        System.out.println("you have selected " + item);
    }

    @Override
    public void insertCoin(List<Coin> coins) {
        vendingMachine.insertCoin(coins);
        vendingMachine.setInsertCoinState();

    }

    @Override
    public void executeTransaction() {
        System.out.println("please insert coin first");
    }

    @Override
    public int cancelTransaction() {
        System.out.println("please insert coin first");
        return 0;
    }
}
