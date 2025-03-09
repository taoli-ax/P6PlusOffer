package day5;

public class Student extends Person {
    private int age;
    static {
        System.out.println("子类静态代码");
    }
    public Student (){
        this.age=-3;
        System.out.println("子类构造方法");
    }
    public void printName(){
        System.out.println("子类方法 age is : "+age);
    }
}
