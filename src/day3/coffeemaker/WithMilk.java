package day3.coffeemaker;

public class WithMilk extends CoffeeDecorator{
    public WithMilk(Coffee coffee) {
        super(coffee);
    }
    public double getPrice(){
       return super.getPrice()+0.5;
    }

    public String getIngredients(){
       return super.getIngredients()+" with Milk";
    }
}
