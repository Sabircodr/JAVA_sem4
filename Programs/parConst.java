public class Room1 {
    double l, b, h;
    double area, volume;

    public Room1(double length, double breadth, double height) {
        l = length;
        b = breadth;
        h = height;
    }

    public void calArea() {
        area = l * b;
    }

    public void calVolume() {
        volume = l * b * h;
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        // Creating object of Room1 with parameters
        Room1 room = new Room1(5.5, 3.2, 2.0);

        // Calculating area and volume
        room.calArea();
        room.calVolume();

        // Displaying results
        System.out.println("Area of the room: " + room.area);
        System.out.println("Volume of the room: " + room.volume);
    }
}
