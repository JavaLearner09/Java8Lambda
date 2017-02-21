package io.practice.Advance;

import java.util.function.Consumer;
import java.util.function.Predicate;

/*
	If in a Lambda Ex we are just calling a method then we can use the Method Reference 
	Method reference is written as ClassName :: Method name  here the Method name is same method which we call in the 
	Lambda Expression
*/
public class MethodReferenceExample {

	public static void main(String[] args) {
		int a=10;
	 // doProcess(a, t -> execute());
		
	//	this method reference will pass the execute() method  to the Consumer.accept(t) function 
		doProcess(a , MethodReferenceExample::execute);
		
	//	this method reference will pass the System.out.println(a) to the Consumer.accept(t) function 
		doProcess(a, System.out::println);

	}

	private static void doProcess(int t , Consumer<Integer> consumer ) {
		System.out.println("From inside doProcess method : " +t);
		consumer.accept(t);
	}

	private static void execute(int a) {
		System.out.println("From inside execute method : "+ a);
	}
}
