package io.practice;

public class HelloWorldGreeter implements IGreeter {

	@Override
	public void perform() {
		System.out.println("Hello World from HelloWorldGreeter!");
	}

}
