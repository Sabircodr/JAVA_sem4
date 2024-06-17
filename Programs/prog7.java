abstract class Bike {
    abstract void run();

    void gearChange() {
        System.out.println("Gear Change");
    }
}

class TVS extends Bike {
    void run() {
        System.out.println("Bike is Running Safely");
    }
}

public class MainBike {
    public static void main(String[] args) {
        Bike bike = new TVS();
        bike.run();
        bike.gearChange();
    }
}
