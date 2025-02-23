package day3.vendingmachine;

import java.util.HashMap;
import java.util.List;

public class StockWrapper {
    private HashMap<ItemInfo, List<Item>> stock;
    public void add(Item item){
            ItemInfo itemInfo = item.getItemInfo();
            List<Item> itemsStock = stock.get(itemInfo);
            itemsStock.add(item);
            stock.put(itemInfo, itemsStock);
    }

    public void deduct(Item item){

    }

    public int getQuantity(Item item){
        return 0;
    }
}
