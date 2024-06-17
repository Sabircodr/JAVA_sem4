class TryCatch
{
	public static void main(String args[])
	{
		int arr[]=new int[5];
		int a = 100;
		int c;

		
		try
		{
			c=a/Integer.parseInt(args[0]);
			arr[5]=Integer.parseInt(args[1]);
		}
	
		catch(ArithmeticException e)
		{
			System.out.println("Not Divisible by zoro" +e);
		}
	
		catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.println("Array Out of Bound" +f);
		}
	}
}	
