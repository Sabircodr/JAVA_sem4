//Write a program in Java to calculate Simple Interest using Scanner class.
import java.util.Scanner;
class SI
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle amount:");
		int P=sc.nextInt();
		System.out.println("enter the rate of interest");
		double R=sc.nextDouble();
		System.out.println("enter the time period");
		int T=sc.nextInt();
		double SI=P*R*T/100;
		System.out.println("simple interest: "+SI);
	}
}