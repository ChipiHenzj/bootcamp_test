package main.java.org.activity08;

public class TinyFloat {

	/**
	 * @param args
	 * @throws TinyFloatException
	 */

	// implement basic mathematical operations with float numbers in range
	// of
	// [-10..+10] (including)

	// Hint: First check that input values are in valid range, and if they are,
	// process operation, then check, that resulting value is in range.
	// Throw TinyFloatException with appropriate message, if values are not.

	// You can develop your own private methods, to reuse validation/exception
	// generation code

	private static void checkA(float a) throws TinyFloatException {
		if (a > 10.f) {
			throw new TinyFloatException("input value a: " + a
					+ " is above 10.0");
		} else if (a < -10.f) {
			throw new TinyFloatException("input value a: " + a
					+ " is below -10.0");
		}
	}

	private static void checkB(float b) throws TinyFloatException {
		if (b > 10.f) {
			throw new TinyFloatException("input value b: " + b
					+ " is above 10.0");
		} else if (b < -10.f) {
			throw new TinyFloatException("input value b: " + b
					+ " is below -10.0");
		}
	}

	public static float add(float a, float b) throws TinyFloatException {
		// #1 implement adding operation

		checkA(a);
		checkB(b);

		if ((a + b) > 10.f) {
			throw new TinyFloatException("output value a:b " + a + "+" + b
					+ " is above 10.0");
		} else if ((a + b) < -10.f) {
			throw new TinyFloatException("output value a:b " + a + "+" + b
					+ " is below -10.0");
		}

		return (a + b);
	}

	public static float subtract(float a, float b) throws TinyFloatException {
		// #2 implement subtract operation

		checkA(a);
		checkB(b);

		if ((a - b) > 10.f) {
			throw new TinyFloatException("output value a:b " + a + "-" + b
					+ " is above 10.0");
		} else if ((a - b) < -10.f) {
			throw new TinyFloatException("output value a:b " + a + "-" + b
					+ " is below -10.0");
		}
		return (a - b);
	}

	public static float multiply(float a, float b) throws TinyFloatException {
		// #3 implement multiply operation

		checkA(a);
		checkB(b);

		if ((a * b) > 10.f) {
			throw new TinyFloatException("output value a:b " + a + "*" + b
					+ " is above 10.0");
		} else if ((a * b) < -10.f) {
			throw new TinyFloatException("output value a:b " + a + "*" + b
					+ " is below -10.0");
		}
		return (a * b);
	}

	public static float divide(float a, float b) throws TinyFloatException {
		// #4 implement divide operation

		checkA(a);
		checkB(b);

		if ((a / b) > 10.f) {
			throw new TinyFloatException("output value a:b " + a + "/" + b
					+ " is above 10.0");
		} else if ((a / b) < -10.f) {
			throw new TinyFloatException("output value a:b " + a + "/" + b
					+ " is below -10.0");
		}
		return (a / b);
	}

}
