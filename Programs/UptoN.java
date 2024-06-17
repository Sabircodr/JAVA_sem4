//Write a Java program to find the sum of first n natural numbers where n is input by the user. 
import java.util.Scanner;
class UptoN
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i,S=0;
		System.out.print("Enter the value of \'n\': ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
			S=S+i;
		System.out.print("The Sum of first "+n+ " numbers is "+S);
		}
}