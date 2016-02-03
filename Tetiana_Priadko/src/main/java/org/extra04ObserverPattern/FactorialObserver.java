package main.java.org.extra04ObserverPattern;

public class FactorialObserver extends Observer {

	public FactorialObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		int result = 0;
		/*
		 * TODO Implement code that to variable "result" is assigned value of
		 * States factorial value.
		 */

		System.out.println("Factorial is: " + result);
	}
}