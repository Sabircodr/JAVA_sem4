class Try1
{
	void M()
	{
		System.out.println("Helloooo World! ");
	}

	void N()
	{
		this.M();
		System.out.println("Welcomee!!!! ");
	}
}
class Test
{
	public static void main(String args[])
	{
		Try1 ob= new Try1();
		ob.M();
	}
}