package io.practice;

public class LambdaSample {

	public static void main(String srgs[]){
		
		LambdaSample lambdaSample = new LambdaSample();
		IGreeter greetingFunction = () -> System.out.println("Hello World !");
		
		Addition addition = (int a ,int b) -> a+b;
		
		lambdaSample.greet(greetingFunction);
		
//		greetingFunction.perform();
	}
	
	public void greet(IGreeter greeter){
		greeter.perform();
	}
 
}	
	

interface Greeting{
	void perform();
}
	
interface Addition{
	int add(int a , int b);
}
