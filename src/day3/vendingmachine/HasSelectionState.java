package day3.vendingmachine;

import java.util.List;

public class HasSelectionState implements State {
    VendingMachine vendingMachine;

    public HasSelectionState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {

    }

    @Override
    public void insertCoin(List<Coin> coins) {

    }

    @Override
    public void executeTransaction() {
    }

    @Override
    public int cancelTransaction() {

        return 0;
    }
}
