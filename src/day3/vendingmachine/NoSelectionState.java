package day3.vendingmachine;

import java.util.List;

public class NoSelectionState implements State{
    VendingMachine vendingMachine;
    public NoSelectionState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {
        vendingMachine.getSelectItem(item);
        vendingMachine.setHasSelectionState();
    }

    @Override
    public void insertCoin(List<Coin> coins) {
        System.out.println("please make a selection first");

    }

    @Override
    public void executeTransaction() {
        System.out.println("please make a selection first");
    }

    @Override
    public int cancelTransaction() {
        System.out.println("please make a selection first");
        return 0;
    }
}
