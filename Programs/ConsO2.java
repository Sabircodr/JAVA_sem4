public class Room3 {
    double l, b, h;
    double area, volume;

    // Constructor with parameters: int, int, double
    public Room3(int length, int breadth, double height) {
        this.l = length;
        this.b = breadth;
        this.h = height;
    }

    // Constructor with parameters: double, int, int
    public Room3(double height, int length, int breadth) {
        this.h = height;
        this.l = length;
        this.b = breadth;
    }

    // Method to calculate and return area
    public double calArea() {
        return l * b;
    }

    // Method to calculate and return volume
    public double calVolume() {
        return l * b * h;
    }
}

public class Sequence {
    public static void main(String[] args) {
        // Example usage:
        Room3 room1 = new Room3(5, 3, 2.0); // Using first constructor (int, int, double)
        Room3 room2 = new Room3(2.0, 5, 3); // Using second constructor (double, int, int)

        // Display results using methods
        System.out.println("Room 1 - Area: " + room1.calArea() + ", Volume: " + room1.calVolume());
        System.out.println("Room 2 - Area: " + room2.calArea() + ", Volume: " + room2.calVolume());
    }
}
