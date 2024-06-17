import java.util.Scanner;
class Person
{
	void display(int id, String name)
		{
		System.out.println("ID: "+id+"\tName: "+name);
		}
	void display(String name, int id)
		{
		System.out.println("\nID: "+id+"\nName: "+name);
		}
}
class Test
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Person p= new Person();
		String n1;
		int id1;
		System.out.println("Enter the first ID, Name");
		id1=in.nextInt();
		n1=in.next();
		p.display(id1,n1);
		System.out.println("Enter the second ID, Name");
		id1=in.nextInt();
		n1=in.next();
		p.display(n1,id1);
		
	}
}