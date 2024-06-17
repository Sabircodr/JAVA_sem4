//Write a java program to create a base class 'B' and print the values of two variable i and j in that class with a display() method. Now create a class 'Derive' that inherits the previous base class with a variable and a method sumijk() and print the sum of i, j and k in the 'Derive' class and also print the values of i, j and k.  (object initialized by reference variable)

class B
{
	int i;
	int j;
	void display()
	{
		System.out.println(" I= "+i);
		System.out.println(" J= "+j);
	}
}
class Derive extends B
{
	int k;
	
	void sumijk()
	{
		int sum=i+j+k;
		System.out.println(" K= "+k);
		System.out.println(" Sum= "+sum);
	}
}
class Run
{
	public static void main(String args[])
	{
		Derive d = new Derive();

		d.i=10;
		d.j=20;
		d.k=30;
		d.display();
		d.sumijk();
	}
}