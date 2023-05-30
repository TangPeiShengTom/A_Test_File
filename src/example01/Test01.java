package example01;

public class Test01 {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.name = "舔狗:";
        dog.color = "在吗？？？";

        dog.feature();
        dog.barks();
    }


}



class Dog {
    public String name;
    public String color;

    public void barks() {
        System.out.println(name+"汪汪汪！！！");
    }
    public void feature() {
        System.out.println(color+"摇尾巴！！！");
    }
}




