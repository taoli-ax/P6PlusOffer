package day3.coffeemaker;

public class SimpleCoffee implements Coffee {

    @Override
    public double getPrice() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Plain Coffee";
    }
}
