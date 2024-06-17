public class Car {
    String name;

    public Car() {
        System.out.println("Default value of name: " + name);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Car myCar = new Car();
    }
}
