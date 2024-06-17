class Try
{
	int roll;
	String name;
	double fees;
	Try (int roll, String name, double fees)
	{
		this.roll=roll;
		this.name=name;
		this.fees=fees;
	}
	void Display()
	{
		System.out.println("Roll: "+roll+"\tName: "+name+"\tFees: "+fees);
	}
}
class Test123
{
	public static void main(String args[])
	{
		Try ob1= new Try(123,"Sabir",2300.50);
		Try ob2= new Try(354,"Ärpita",5600.40);
		ob1.Display();
		ob2.Display();
	}
}