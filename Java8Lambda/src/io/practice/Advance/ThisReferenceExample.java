package io.practice.Advance;
/*
	One difference between Annomous Inner Class and Lambda expression is :
	'This' in the annomanous inner class refers to the instance 
	but in Lambda 'this' refers to 
*/
public class ThisReferenceExample {
	
	public static void main(String args[]){
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		int i = 10;
		thisReferenceExample.doProcess(i, (int a) -> {
			System.out.println(a);
		//	System.out.println(this);   ----Here we cannot use this for the same reason as the static method 
		});
		thisReferenceExample.doProcess(i , new Process(){

			@Override
			public void execute(int a) 
			{
				System.out.println(a);
				System.out.println(this);
			}
			
			/*public String toString(){
				return "This reffer To string function";
			}*/
			
		});
		
	}

	private void doProcess(int a, Process process) {
		process.execute(a);
	}

	
}
