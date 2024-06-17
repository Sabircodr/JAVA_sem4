/*
Write a program of hierarchical inheritance to create a superclass 'Building' that stores the number of floors, number of bedrooms and total area. Create two derived classes form 'Building' class with the following attributes -
		BHK2 -	|  Number of bedroom		BHK3 -	|  Number of Bedroom
				|  Number of bathroom				|  Number of Bathroom
				|  Number of floors					|  Number of Floor
				|  Total Area						|  Number of Balcony
												|  Total Area

	NB: Use 'super' keyword in derived classes to invoke immediate parent class constructor
*/

class Building
{
	int floor, bedroom, area;
	Building(int floor, int bedroom, int area)
	{
		this.floor = floor;
		this.bedroom = bedroom;
		this.area = area;
	}
	void display1()
	{
		System.out.println("Number of floor: "+floor);
		System.out.println("Number of bedroom: "+bedroom);
		System.out.println("Total Area: "+area+" sqrt");
	}
}

class BHK2 extends Building
{
	int bathroom;
	BHK2(int floor, int bedroom, int area, int bathroom)
	{
		super(floor, bedroom, area);
		this.bathroom = bathroom;
	}
	void display2()
	{
		System.out.println("Number of bathroom: "+bathroom);
		display1();
	}
}

class BHK3 extends Building
{
	int bathroom,balcony;
	BHK3(int floor, int bedroom, int area, int bathroom, int balcony)
	{
		super(floor, bedroom, area);
		this.bathroom = bathroom;
		this.balcony = balcony;
	}
	void display2()
	{
		System.out.println("Number of bathroom: "+bathroom);
		System.out.println("Number of balcony: "+balcony);
		display1();
	}
}


class RunTest
{
	public static void main(String args[])
	{
		Building b = new Building (5,1,220);
		BHK2 b2 = new BHK2(6,2,338,2);
		BHK3 b3 = new BHK3(10,3,500,3,2);


		System.out.println("\n-------------------------------------------------------------\n");
		b.display1();
		System.out.println("\n-------------------------------------------------------------\n");
		b2.display2();
		System.out.println("\n-------------------------------------------------------------\n");
		b3.display2();
		System.out.println("\n-------------------------------------------------------------\n");

	}
}