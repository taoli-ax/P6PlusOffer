package day3.vendingmachine;

import java.util.List;

public interface State {
    public void selectItem(String item);
    public void insertCoin(List<Coin> coins);
    public void executeTransaction();
    public int cancelTransaction();
}

