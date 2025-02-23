package day3.coffeemaker;

public abstract class CoffeeDecorator implements Coffee{
    protected final Coffee decoratedCoffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice();
    }

    @Override
    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }
}
