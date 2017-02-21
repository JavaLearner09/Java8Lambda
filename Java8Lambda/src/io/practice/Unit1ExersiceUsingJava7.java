package io.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExersiceUsingJava7 
{

	public static void main(String[] args) 
	{
		List<Person> people = Arrays.asList(new Person("Thomas", "Carlyle", 32),
											new Person("Charles", "Dickens", 60),
											new Person("Lewis", "Carrole", 40),
											new Person("Charlotte", "Bronte", 56),
											new Person("Methew", "Arnold", 56));
		
		// Step1 : Sort list by lastname
		Collections.sort(people, new Comparator<Person>()
									{
										@Override
										public int compare(Person p1, Person p2) 
										{
											return p1.getLastName().compareTo(p2.getLastName());
										}
									});

		// Step2 : Create a method that prints all the elements in the list
		System.out.println("Print All People");
		//printAll(people);
		printConditionally(people ,  new NameFilterCondition()
											{
												@Override
												public boolean test(Person p) {
													return true;
											}

										});

		// Step3 : Create a method that prints all the people that have the lastname beginning with C
		System.out.println("Print All People Whose LastName Begin With C");
		//printLastNameBeginingWithC(people);
		printConditionally(people ,  new NameFilterCondition()
											{
												@Override
												public boolean test(Person p) {
													return p.getLastName().startsWith("C");			
											}
									});
		
		// Step3 : Create a method that prints all the people that have the lastname beginning with C
		System.out.println("Print All People Whose FirstName Begin With C");
		//	printFirstNameBeginingWithC(people);
		
		printConditionally(people ,  new NameFilterCondition(){
											@Override
											public boolean test(Person p) {
												return p.getFirstName().startsWith("C");
											}
							});
	}

	
	private static void printConditionally(List<Person> people , NameFilterCondition condition) 
	{		
		for(Person p : people)
		{
			if(condition.test(p))
			{
				System.out.println(p);
			}
		}
	}
	
	
	
//	private static void printFirstNameBeginingWithC(List<Person> people) 
//	{
//		for(Person p : people)
//		{
//			if(p.getFirstName().startsWith("C"))
//			{
//				System.out.println(p);
//			}
//		}
//	}
//
//	private static void printLastNameBeginingWithC(List<Person> people) {
//		for (Person p : people)
//		{
//			if(p.getLastName().startsWith("C"))
//			{
//				System.out.println(p);
//			}
//		}
//	}

//	private static void printAll(List<Person> people) {
//		for(Person p : people)
//		{
//			System.out.println(p);
//		}
//	}

}

interface NameFilterCondition{
	boolean test(Person p);
}
