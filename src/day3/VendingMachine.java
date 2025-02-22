package day3;
import java.util.*;

import javafx.util.Pair;

public class VendingMachine {
    // 替代自动售货机的类
    private List<Coin> currentCoins;
    private List<Item> items;
    private Map<String, List<Item>> stock;
    private Map<String, ItemInfo> itemIdentifiers;
    private ItemInfo selectedItem;


    public float getSelectItem(String selection){
        return 0.5f;
    }
    
    public void insertCoin(List<Coin> coins){
        currentCoins.addAll(coins);
    }
    private List<Coin> refund(){
        List<Coin> refund = new ArrayList<>();
        for(Coin coin: currentCoins){
            refund.add(coin);
        }
        currentCoins.clear();
        return refund;
    }

}
