package day5;

public class Person {
    private int age;
    public Person() {
        this.age=100;
        System.out.println("父类构造方法");
    }
    static {
        System.out.println("父类静态代码");
    }

    public int getAge() {
        System.out.println("父类方法 age is:"+this.age);
        return this.age;
    }
}
