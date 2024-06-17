class Sum
{
	int sum(int x, int y)
		{
			return(x+y);
		}
	int sum(int x, int y,int z)
		{
			return(x+y+z);
		}
	double sum(double x, double y)
		{
			return(x+y);
		}
}
class TestSum
{
	public static void main(String args[])
	{
		Sum s = new Sum();
		System.out.println("The sum is "+s.sum(10.2,15.5));						System.out.println("The sum is "+s.sum(5,6));							System.out.println("The sum is "+s.sum(10,10,20));
	}
}