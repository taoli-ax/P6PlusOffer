package day3.vendingmachine;

public class Item {
   private ItemInfo itemInfo;
   public Item(ItemInfo itemInfo) {
       this.itemInfo = itemInfo;
   }
   public ItemInfo getItemInfo() {
       return itemInfo;
   }
}
