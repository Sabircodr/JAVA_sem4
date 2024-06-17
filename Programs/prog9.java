abstract class Vegetable {
    abstract void color();
    abstract void whereGrow();
}

class Peanut extends Vegetable {
    void color() {
        System.out.println("Color of Peanut: Brown");
    }

    void whereGrow() {
        System.out.println("Peanut grows in warm climates");
    }
}

class Tomato extends Vegetable {
    void color() {
        System.out.println("Color of Tomato: Red");
    }

    void whereGrow() {
        System.out.println("Tomato grows in various climates");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Vegetable peanut = new Peanut();
        Vegetable tomato = new Tomato();

        peanut.color();
        peanut.whereGrow();

        tomato.color();
        tomato.whereGrow();
    }
}
