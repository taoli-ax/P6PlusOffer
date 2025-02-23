package day3.vendingmachine;
import java.util.*;

import javafx.util.Pair;

public class VendingMachine {
    // 替代自动售货机的类
    private List<Coin> currentCoins;
    private List<Item> items;
//    private HashMap<ItemInfo, List<Item>> stock;
    StockWrapper stock;
    private Map<String, ItemInfo> itemIdentifiers;
    private ItemInfo selectedItem;

    private State state;
    private HasSelectionState hasSelectionState;
    private VendingState vendingState;
    private NoSelectionState noSelectionState;
    private InsertCoinState insertCoinState;

    public VendingMachine() {
        hasSelectionState = new HasSelectionState(this);
        noSelectionState = new NoSelectionState(this);
        insertCoinState = new InsertCoinState(this);
        this.state = noSelectionState;
    }

    public void setHasSelectionState() {
        this.state = hasSelectionState;
    }
    public void setNoSelectionState() {
        this.state = noSelectionState;
    }
    public void setInsertCoinState() {
        this.state = insertCoinState;
    }



    public float getSelectItem(String selection){
        return 2.5f;
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

    public Pair<Item,List<Coin>> executeTransaction(){
        List<Coin> refundCoin = refund();
        return new Pair(new Item(new ItemInfo("可乐",2.5f)),refundCoin);
    }

    public List<Coin> cancelTransaction(){
        return refund();
    }
    public  void  refillItems(List<Item> items){
        for (Item item: items){
            stock.add(item);
       }
    }

    public void setState(State state){
        this.state = state;
    }
}

