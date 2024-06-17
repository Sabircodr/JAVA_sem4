//Write Java program of method overriding to create a class 'Vehicle' with a method run() and now create a class 'Bike' which inherits the Vehicle class with the same method run(). The run method of Bike() class override the run() method of Vehicle class. Now show the output after overriding.

class Vehicle
{
	void run()
	{
		System.out.println("Vehicle running");
	}
}
class Bike extends Vehicle
{
	void run()
	{
		System.out.println("Bike running");
	}
}
class TestVehicle
{
	public static void main(String args[])
	{
		Vehicle v = new Vehicle();
		Bike b = new Bike();
		v.run();
		b.run();
	}
}