//Write a program in java to implement hierarchi inheritance with a base class 'Animal2' with eat() method. Now create two derived/extended class 'Dog1' and 'Cat1' with bark() and meow() respectively. Now print all the methods' statement of 3 classes in another class 'TestAnimal2' 

class Animal2
{
	void eat()
	{
		System.out.println("Animals Eat");
	}
}
class Dog1 extends Animal2
{
	void bark()
	{
		System.out.println("Dogs Bark");
	}
}
class Cat1 extends Animal2
{
	void meow()
	{
		System.out.println("Cat Meow");
	}
}
class TestAnimal2
{
 	public static void main(String args[])
	{
		Dog1 dog = new Dog1();
		Cat1 cat = new Cat1();
		dog.eat();
		dog.bark();
		cat.eat();
		cat.meow();
	}
}