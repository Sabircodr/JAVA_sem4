//Create a class 'Circle' to implement single inheritance with method overriding having one data member radius in double and a method getArea() to return the area of circle. Now create a subclass Cylinder having another data member height. The cylinder will override the gerArea() method to return the surface area of cylinder. Create objects of Circle and Cylinder class in another class and show the area of circle and surface area of cylinder.

class Circle
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	double getArea()
	{
		double area;
		area=(22/7)*radius*radius;
		return area;
	}
}

class Cylinder extends Circle
{
	double height;
	Cylinder(double radius, double height)
	{
		super(radius);
		this.height=height;
	}
	double getArea()
	{
		double surArea;
		surArea=2*(22/7)*radius*height;
		return surArea;
	}
}
class Another
{
	 public static void main(String args[])
	{
		Circle cir = new Circle(3.24);
		Cylinder cyl = new Cylinder(3.3,6.2);
		System.out.println("Area = "+cir.getArea());
		System.out.println("Surface Area = "+cyl.getArea());
	}
}