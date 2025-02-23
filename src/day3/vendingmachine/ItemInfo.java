package day3.vendingmachine;

public class ItemInfo {
    private String name;
    private double price;

    public ItemInfo(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
