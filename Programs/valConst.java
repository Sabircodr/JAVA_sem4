import java.util.Scanner;

public class Room {
    double l, b, h;
    double area, volume;

    public Room() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length (l): ");
        l = scanner.nextDouble();

        System.out.print("Enter breadth (b): ");
        b = scanner.nextDouble();

        System.out.print("Enter height (h): ");
        h = scanner.nextDouble();

        scanner.close();
    }

    public void calArea() {
        area = l * b;
    }

    public void calVolume() {
        volume = l * b * h;
    }
}

public class TestRoom {
    public static void main(String[] args) {
        Room room = new Room();

        room.calArea();
        room.calVolume();

        System.out.println("Area of the room: " + room.area);
        System.out.println("Volume of the room: " + room.volume);
    }
}
