//Write a java program of single inheritance with a class 'Emp' of salary 80,500 (variable) and a sub-class 'Programmer' with bonus 25,000(variable) and print the salary and bonus of programmer.
class Emp
{
	int salary = 80500;
}

class Programmer extends Emp
{
	int bonus = 25000;
	void display()
	{
		System.out.println("Salary of the programmer: "+salary);
		System.out.println("Bonus of the programmer: "+bonus);
	}
	
}
class Print
{
	public static void main(String args[])
	{
		Programmer p = new Programmer();
		p.display();
	}
}