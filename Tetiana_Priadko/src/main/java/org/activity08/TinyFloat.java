package main.java.org.activity08;

import junit.framework.Assert;

public class TinyFloat {

	/**
	 * @param args
	 * @throws TinyFloatException
	 */

	// TODO implement basic mathematical operations with float numbers in range
	// of
	// [-10..+10] (including)

	// Hint: First check that input values are in valid range, and if they are,
	// process operation, then check, that resulting value is in range.
	// Throw TinyFloatException with appropriate message, if values are not.

	// You can develop your own private methods, to reuse validation/exception
	// generation code
	public static float add(float a, float b) throws TinyFloatException {
		// TODO #1 implement adding operation
		
		//check a
		checkA(a);
		
		//check b
		checkB(b);
		
		//check sum
		if ((a + b) > 10.f) {
			throw new TinyFloatException("sum is above 10.0");
		} else if((a + b) < -10.f){
			throw new TinyFloatException("sum is below -10.0");
		}
		
		return (a + b);
	} 

	public static float subtract(float a, float b) throws TinyFloatException {
		// TODO #2 implement subtract operation
		//check a
		checkA(a);
		
		//check b
		checkB(b);
		
		//check substract
		if ((a - b) > 10.f) {
			throw new TinyFloatException("substract is above 10.0");
		} else if((a - b) < -10.f){
			throw new TinyFloatException("substract is below -10.0");
		}
		
		return (a - b);	}

	public static float multiply(float a, float b) throws TinyFloatException {
		// TODO #3 implement multiply operation
		//check a
		checkA(a);
		
		//check b
		checkB(b);
		
		//check multiply
		if ((a * b) > 10.f) {
			throw new TinyFloatException("multiply is above 10.0");
		} else if((a * b) < -10.f){
			throw new TinyFloatException("multiply is below -10.0");
		}
		
		return (a * b);
	}

	public static float divide(float a, float b) throws TinyFloatException {
		// TODO #4 implement divide operation
		//check a
		checkA(a);
		
		//check b
		checkB(b);
		
		//check divide
		if ((a / b) > 10.f) {
			throw new TinyFloatException("divide is above 10.0");
		} else if((a / b) < -10.f){
			throw new TinyFloatException("divide is below -10.0");
		}
		
		return (a / b);
	}
	
	private static void checkA(float a) throws TinyFloatException{
		if(a > 10.f){
			throw new TinyFloatException("input value a: " + a + " is above 10.0");
		} else if(a < -10.f){
			throw new TinyFloatException("input value a: " + a + " is below -10.0");
		}
	}

	private static void checkB(float b) throws TinyFloatException{
		//check b
		if(b > 10.f){
			throw new TinyFloatException("input value b: " + b + " is above 10.0");
		} else if(b < -10.f){
			throw new TinyFloatException("input value b: " + b + " is below -10.0");
		}
	}

}
