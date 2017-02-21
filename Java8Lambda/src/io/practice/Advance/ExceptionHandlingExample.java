package io.practice.Advance;

import java.util.function.BiConsumer;

/*  Using BiConsumer<T,U> Functional Interface
    as it takes 2 arguments and return no results
    Also here we will be doing Exceptional Handling uisng a Wrapper class
*/
public class ExceptionHandlingExample {

	public static void main(String args[]){
		Integer [] inputArray = {4,8,6,8,10};
		Integer key = 0;
		BiConsumer<Integer, Integer> divisionFunction = wrapperLambda((a , b) -> System.out.println(a / b)) ;
		process(inputArray, key, divisionFunction);
		
	}
	
	public static void process(Integer[] inputArray,int key, BiConsumer<Integer, Integer> consumer )
	{
		for(Integer i : inputArray)
		{
			consumer.accept(i, key);
		}
	}
	
	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		return (a , b) -> {
							try
							{
								consumer.accept(a, b);
							}catch(ArithmeticException ex){
								System.out.println(ex);
							}
						};
		}
	
}
