package day3.coffeemaker;

public class WithSprinkles extends CoffeeDecorator{
    protected WithSprinkles(Coffee coffee) {
        super(coffee);
    }

    public double getPrice() {
        return super.getPrice() + 0.2;
    }

    public String getIngredients() {
        return super.getIngredients() + ", With Sprinkles";
    }
}
