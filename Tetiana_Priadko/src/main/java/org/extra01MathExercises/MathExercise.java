package main.java.org.extra01MathExercises;

import java.math.BigInteger;

public class MathExercise {
	public int commonDivisor(int number1, int number2) {
		int commonDivisior = 0;
		// #1: Implement method that returns largest common divisor of
		// passed values

		BigInteger b1 = BigInteger.valueOf(number1);

		BigInteger b2 = BigInteger.valueOf(number2);

		BigInteger gcd = b1.gcd(b2);

		commonDivisior = gcd.intValue();

		return commonDivisior;
	}
}
