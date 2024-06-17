class Student
{
	static int i;
	static String n;
	Student(int id, String name) 
	{
		i = id;
		n = name;
	}
	public static void main(String arg[]) 
	{
		Student s = new Student(104, "Sabir");
		System.out.println("The id is:" + i);
		System.out.println("The name is:" + n);
	}
}