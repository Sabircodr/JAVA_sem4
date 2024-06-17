//Write a program to find the area and perimeter of a rectangle where length and width are input by user using Scanner class
import java.util.Scanner;
class areaRect
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double l,b,area=0,perimeter=0;
		System.out.print("Enter the length of the rectangle: ");
		l=sc.nextDouble();
		System.out.print("Enter the breadth of the rectangle: ");
		b=sc.nextDouble();
		area=l*b;
		perimeter=2*(l+b);
		System.out.println("The area of the rectangle is "+area);
		System.out.println("The perimeter of the rectangle is "+perimeter);
	}
}