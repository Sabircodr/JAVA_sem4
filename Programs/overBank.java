/*Write a program in Java to create a class 'Bank' that provides the functionality to display the rate of interest. Rate of Interest varies according to the bank. Next create 3 sub-classes SBI, ICICI and Axis to implement hierarchial inheritance with method overriding, the extends the Bank class and show the rate of interest as follows:
		ROI of 	SBI is 8%
			ICICI is 7%
			Axis is 9%.
*/

class Bank
{
	void roi(int P, int R, int T)
	{
		int SI = P*R*T/100;
		System.out.println("Simple Interest = "+SI);
	}
}
class SBI extends Bank
{
	int R = 8;
	void roi(int P,int T)
	{
		roi(P,R,T);
	}
}
class ICICI extends Bank
{
	int R = 7;
	void roi(int P,int T)
	{
		roi(P,R,T);
	}
}
class Axis extends Bank
{
	int R = 9;
	void roi(int P,int T)
	{
		roi(P,R,T);
	}
}

class Check
{
	public static void main(String args[])
	{
		SBI sbi = new SBI();
		ICICI icici = new ICICI();
		Axis axis = new Axis();		
		sbi.roi(7000,10);
		icici.roi(5000,5);
		axis.roi(20000,5);
	}
}