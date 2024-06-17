class Sum
{
	void sum(int x, int y)
		{
		System.out.println("The sum is "+(x+y));
		}
	void sum(int x, int y,int z)
		{
		System.out.println("The sum is "+(x+y+z));
		}
	void sum(double x, double y)
		{
		System.out.println("The sum is "+(x+y));
		}
}
class TestSum
{
	public static void main(String args[])
	{
		Sum s = new Sum();
		s.sum(10.2,15.5);						
		s.sum(5,6);
		s.sum(10,20,20);
	}
}