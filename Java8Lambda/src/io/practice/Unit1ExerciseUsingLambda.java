package io.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseUsingLambda {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Thomas", "Carlyle", 32),
											new Person("Charles", "Dickens", 60),
											new Person("Lewis", "Carrole", 40),
											new Person("Charlotte", "Bronte", 56),
											new Person("Methew", "Arnold", 56));
		
		// Step1 : Sort list by lastname
		Comparator<Person> comparatorFunction = (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName());
		Collections.sort(people, comparatorFunction);
		
		// Step2 : Create a method that prints all the elements in the list 
		
		System.out.println("Print All People ");
		NameFilterCondition printAllConditionFunction = (Person p) ->  true;
		printConditinally(people, printAllConditionFunction);
				
		// Step3 : Create a method that prints all the people that have the last name beginning with C
		
		System.out.println("Print All People Whose LastName Begin With C");
		NameFilterCondition printConditionallyFunction = (Person p) -> p.getLastName().startsWith("C"); 
		printConditinally(people, printConditionallyFunction);
}

	private static void printConditinally(List<Person> people, NameFilterCondition condition)
	{
		for(Person p : people)
		{
			if(condition.test(p))
			{
				System.out.println(p);
			}
		}
	}

}

//interface NameFilterCondition{
//	boolean test(Person p);
//}
