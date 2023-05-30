package example01;

public class Test02 {
    public static void main(String[] args) {//通过一个类，可以实例化无数个对象
        //实例化一个Dog对象
        Dog dog = new Dog();
        //int a = 10;
        dog.name = "舔狗";
        dog.color = "在吗？";

        System.out.println(dog.name);
        System.out.println(dog.color);

        dog.barks();
        dog.feature();

        Dog dog1 = new Dog();

        Dog dog2 = new Dog();
    }
}
