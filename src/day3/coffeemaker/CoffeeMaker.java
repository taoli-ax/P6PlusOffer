package day3.coffeemaker;

public class CoffeeMaker {
    public static void println(Coffee coffee) {
        System.out.println(
                "cost:"+coffee.getPrice()+" Ingredients:"+coffee.getIngredients()
        );
    }
    public Coffee brewCoffee() {
        System.out.println("Coffee is brewing");
        Coffee simpleCoffee = new SimpleCoffee();
        println(simpleCoffee);
        simpleCoffee = new WithMilk(simpleCoffee);
        println(simpleCoffee);
        simpleCoffee = new WithSprinkles(simpleCoffee);
        println(simpleCoffee);
        return simpleCoffee;
    }
}
