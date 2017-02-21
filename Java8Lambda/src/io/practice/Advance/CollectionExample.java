package io.practice.Advance;

import java.util.Arrays;
import java.util.List;

import io.practice.Person;
/*
	This class prints the Person List using simple for loop , Advance for loop and the Java8 addtion of 
	For-each loop on the Collections.
*/	
public class CollectionExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Thomas", "Carlyle", 32),
											new Person("Charles", "Dickens", 60),
											new Person("Lewis", "Carrole", 40),
											new Person("Charlotte", "Bronte", 56),
											new Person("Methew", "Arnold", 56));
		
	//	Simple for loop to print the values from the List<Person> 
		System.out.println("Using Simple for loop");
		for(int i=0 ; i<people.size(); i++){
			System.out.println(people.get(i));
		}
		
	//  for in loop to print the values from the List<Person> 
		System.out.println("Using for in loop");
		for(Person p : people){
			System.out.println(p);
		}
		
	// for-each loop to print the values from the List<Person> 
		System.out.println("Using for-each loop");
		people.forEach( p->System.out.println(p) );
		
	}

}
