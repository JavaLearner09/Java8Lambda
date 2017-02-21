package io.practice.Advance;
/*
	This is Closure Example of Lambda where the variable b is not being passed to the doProcess method 
	but it got executed in the method, the compiler treat the variable 'b' as final variable even if we have not 
	mentioned final in the variable declaration. So if we tried to change the value of the variable b compiler will 
	show error .
	 
*/
public class ClosureExample {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		doProcess(a , (int i) -> System.out.println(i+b));	
	}

	private static void doProcess(int a ,Process process) {
		process.execute(a);
	}

}
 interface Process{
	 void execute(int a);
 }