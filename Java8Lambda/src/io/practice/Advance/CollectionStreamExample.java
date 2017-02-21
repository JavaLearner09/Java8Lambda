package io.practice.Advance;

import java.util.Arrays;
import java.util.List;

import io.practice.Person;
/*	
	Here we will use stream() on the collection 'people' in order to iterate through the Collection and 
	print the conditional data.
	Stream has 3 important things:
	1. the source ie the Collection here we use people
	2. the filter or the conditon where we filter down the results
	2. the end point which either prints or counts the filtered results
*/
public class CollectionStreamExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Thomas", "Carlyle", 32),
											new Person("Charles", "Dickens", 60),
											new Person("Lewis", "Carrole", 40),
											new Person("Charlotte", "Bronte", 56),
											new Person("Methew", "Arnold", 56));
	/*	
	 	Here we will use stream() on the collection 'people' in order to print the conditional data like for ex 
		here we will filter the people whose LastName starts with 'C' and print them.
	*/
		people.stream()
			.filter(p -> p.getLastName().startsWith("C"))
			.forEach(p -> System.out.println(p)); 
		
	/*	
	 	Here we will use stream() on the collection 'people' in order to print the conditional data like for ex 
		here we will filter the people whose LastName starts with 'C'and count them.
	*/
		long count = people.stream()
						.filter(p -> p.getLastName().startsWith("C"))
						.count();
		
		System.out.println("Number of people whose LastName starts with "+ count);
	}

}
