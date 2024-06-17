//Write a Java program to find the largest number of an array, taking input from the user using command-line argument.

class Maximum
{
	public static void main(String args[])
	{
		int max,i;
		int a[] = new int[10];
		for(i=0;i<10;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		max=a[0];
		for(i=1;i<10;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Maximum = "+max);
	}
}