class A extends Thread
{
	public A()
	{	
		super("Thread A");
	}
	
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
			System.out.println("Thread A" +(i+1));
			Thread.sleep(1000);
			}
		}

		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

class B extends Thread
{
	public B()
	{	
		super("Thread B");
	}
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread B" +(i+1));
		}
	}
}

class Threadtest
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		
		a.start();
		b.start();
	}
}

