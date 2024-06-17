public class Room2 {
    double l, b, h;
    double area, volume;

    // Constructor with first sequence: length and breadth
    public Room2(double length, double breadth) {
        this.l = length;
        this.b = breadth;
        this.h = 0; // Default height if not provided
    }

    // Constructor with second sequence: length, breadth, and height
    public Room2(double length, double breadth, double height) {
        this.l = length;
        this.b = breadth;
        this.h = height;
    }

    public void calArea() {
        area = l * b;
    }

    public void calVolume() {
        volume = l * b * h;
    }
}

public class Number {
    public static void main(String[] args) {
        // Creating objects of Room2 with different constructors
        Room2 room1 = new Room2(5.5, 3.2); // Using first constructor (length, breadth)
        Room2 room2 = new Room2(5.5, 3.2, 2.0); // Using second constructor (length, breadth, height)

        // Calculate area and volume for room1
        room1.calArea();
        room1.calVolume();

        // Calculate area and volume for room2
        room2.calArea();
        room2.calVolume();

        // Display results
        System.out.println("Room 1 - Area: " + room1.area + ", Volume: " + room1.volume);
        System.out.println("Room 2 - Area: " + room2.area + ", Volume: " + room2.volume);
    }
}
