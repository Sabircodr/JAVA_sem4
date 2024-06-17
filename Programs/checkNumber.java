//Write a program in Java to find wether an integer input by user is positive, negative or zero.
import java.util.Scanner;
class Check{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n=sc.nextInt();
	if(n==0)
		{
		System.out.println("the number is zero");
		}
	if(n>0)
		{
		System.out.println("the number is positive");
		}
	if(n<0)
		{
		System.out.println("the number is negative");
		}
	}

}