package main.java.org.extra04ObserverPattern;

public class PowerObserver extends Observer {

	public PowerObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		double result;
		// TODO Implement code that to variable "result" is assigned value of
		// States value in power 4.
		result = 0;
		System.out.println("Number in power 4 is: " + result);
	}
}