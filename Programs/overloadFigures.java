import java.util.Scanner;
class Figure
{
	void area(int b, int h)
		{
		System.out.println("Area of triangle: "+(0.5*b*h));
		}
	void area(double r)
		{
		System.out.println("Area of Circle: "+((22/7)*r*r));
		}
	void area(int s)
		{
		System.out.println("Area of Square: "+(s*s));
		}
	void area(double r, double h)
		{
		System.out.println("Area of Curved Surface of Cylinder: "+(2*(22/7)*r*h));
		}
}
class Test
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Figure f= new Figure();
		int a,b;
		double da,db;
		System.out.print("Enter the Base and Height of the Traingle: ");
		b=in.nextInt();
		a=in.nextInt();
		f.area(b,a);
		System.out.print("Enter the Radius of the Circle: ");
		db=in.nextDouble();
		f.area(db);
		System.out.print("Enter the Side of the Square: ");
		b=in.nextInt();
		f.area(b);
		System.out.print("Enter the Radius and Height of the Cylinder: ");
		da=in.nextDouble();
		db=in.nextDouble();
		f.area(da,db);
				
	}
}