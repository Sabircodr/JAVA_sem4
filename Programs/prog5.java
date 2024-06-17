public class Figure {
    public double area(double base, double height) {
        return 0.5 * base * height; // Area of triangle
    }

    public double area(double length, double width) {
        return length * width; // Area of rectangle
    }
}

public class MainClass1 {
    public static void main(String[] args) {
        Figure figure = new Figure();
        System.out.println("Area of Triangle: " + figure.area(5, 3));
        System.out.println("Area of Rectangle: " + figure.area(5, 3));
    }
}
