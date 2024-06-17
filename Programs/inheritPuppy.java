//Write a program in java to implement a chain of inheritance or multilevel inheritance where there is a parent class 'Animal1' with eat() method. Now create a child class 'Dog1'with bark() method and then create a class 'Babydog' - which derived from 'Dog' class with weep() method. Now print all the statement of the methods in another class 'TestAnimal1'

class Animal1
{
	void eat()
	{
		System.out.println("Animals Eat");
	}
}
class Dog1 extends Animal1
{
	void bark()
	{
		System.out.println("Dogs Bark");
	}
}
class Babydog extends Dog1
{
	void weep()
	{
		System.out.println("Puppies Weep");
	}
}
class TestAnimal1
{
 	public static void main(String args[])
	{
		Dog1 dog = new Dog1();
		Babydog pup = new Babydog();
		dog.eat();
		dog.bark();
		pup.eat();
		pup.weep();
	}
}