package io.practice;

public class Greeter 
{
	public static void main(String[] args) 
	{
		Greeter greeter = new Greeter();
		HelloWorldGreeter helloWorldGreeter = new HelloWorldGreeter();
		greeter.greet(helloWorldGreeter);
	}

	public void greet(IGreeter greeter)
	{
		greeter.perform();
		//System.out.println("Hello World !");
	}
	
}
