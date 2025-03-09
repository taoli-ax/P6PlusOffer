package day5;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.printName();
        System.out.println("子类实例调用age is:"+student.getAge());
    }
}
