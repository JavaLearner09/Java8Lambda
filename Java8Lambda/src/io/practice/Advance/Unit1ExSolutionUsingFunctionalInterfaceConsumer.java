package io.practice.Advance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.practice.Person;

public class Unit1ExSolutionUsingFunctionalInterfaceConsumer {

	public static void main(String args[]){
		List<Person> people = Arrays.asList(new Person("Thomas", "Carlyle", 32),
											new Person("Charles", "Dickens", 60),
											new Person("Lewis", "Carrole", 40),
											new Person("Charlotte", "Bronte", 56),
											new Person("Methew", "Arnold", 56));
		
		// Step1 : Sort list by lastname
		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// Step2 : Create a method that prints all the elements in the list 
		System.out.println("Print all people : ");
		printConditionally(people, (Person p) -> true, (Person p) -> System.out.println(p));
				
		// Step3 : Create a method that prints all the people that have the last name beginning with C
		System.out.println("Print people whose lastname begin with C : ");
		printConditionally(people , (Person p) -> p.getLastName().startsWith("C"), (Person p) -> System.out.println(p));
		
		// Step3 : Create a method that prints all the people that have the first name beginning with C
		System.out.println("Print people whose firstname begin with C : ");
		printConditionally(people , (Person p) -> p.getFirstName().startsWith("C"),(Person p) -> System.out.println(p));
		
	}

	private static void printConditionally(List<Person> people , Predicate<Person> predicate , Consumer<Person> consumer) {
		for(Person p : people)
		{
			if(predicate.test(p))
			{
				consumer.accept(p);
			}
		}
	}
}
