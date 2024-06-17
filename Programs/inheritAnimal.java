//Write a java program of single inheritance with a superclass 'Animal' and a method eat(). Now create a sub-class 'Dog' with method bark() and print both the method statement(content of the method) in another class.

class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}
class Output
{
 	public static void main(String args[])
	{
		Dog ani = new Dog();
		ani.eat();
		ani.bark();
	}

}