package day3.coffeemaker;

import org.omg.CORBA.PUBLIC_MEMBER;

public interface Coffee {
    //普通模式
//    private float cost;
//    public float cost(){
//        if(hasMilk()){
//            cost += 0.5f;
//        }
//        if(hasSoy()){
//            cost += 0.5f;
//        }
//        return cost;
//    };
//
//    public boolean hasMilk(){
//        return true;
//    }
//    public boolean hasSoy(){
//        return true;
//    }
    // 装饰器模式
    public double getPrice();
    public String getIngredients();
}
