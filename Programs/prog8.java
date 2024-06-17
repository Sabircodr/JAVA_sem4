abstract class Tiger {
    abstract void eat();
    abstract void sleep();
}

class Cat extends Tiger {
    void eat() {
        System.out.println("Cat is Eating");
    }

    void sleep() {
        System.out.println("Cat is Sleeping");
    }
}

public class MainTest {
    public static void main(String[] args) {
        Tiger tiger = new Cat();
        tiger.eat();
        tiger.sleep();
    }
}
