package main.java.org.activity03;

public class BasicMathFunctions {

	/**
	 * This program teaches you how to use basic math functions. It tells the
	 * story about teeth, candies and money. Fill the code inside TODO sections.
	 * don't touch other code.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}

	/**
	 * Creates two numbers and calculates its sum.
	 * 
	 * @return result of two number addition
	 */
	public int addition(int aliceCandyCount, int maryCandyCount) {
		// #1: Alice had some candies and Mary also had some candies. How
		// many
		// candies will Robert get if he will rob both girls?

		int sum;
		sum = aliceCandyCount + maryCandyCount;
		return sum;
	}

	/**
	 * Creates two numbers and calculates it's difference.
	 * 
	 * @return result of substraction.
	 */
	public int substraction(int teethByMaryBrother, int teethByAliceBrother) {
		// #2 Robert has 32 teeth. Mary's brother and Alice's brothers
		// found out what Robert did
		// and knocked out some of his teeth.
		// How much teeth Robert have left?

		int sub;
		sub = 32 - teethByMaryBrother - teethByAliceBrother;
		return sub;
	}

	/**
	 * Creates two numbers and calculates it's product.
	 * 
	 * @return result of multiplication.
	 */
	public int multiplication(int teethByMaryBrother, int teethByAliceBrother) {
		// #3 Robert's parents caught brothers and forced them to pay 4$
		// for each teeth. How much money will Robert earn?

		int mult;
		mult = 4 * (teethByMaryBrother + teethByAliceBrother);
		return mult;
	}

	/**
	 * Creates two numbers and calculates it's division result.
	 * 
	 * @return result of division.
	 */
	public int division(int moneyForTeeth) {
		// #4 Brothers are very poor, so Robert agreed to reduce the cost
		// by half. How much money will Robert earn now?

		int div;
		div = moneyForTeeth / 2;
		return div;
	}

	/**
	 * Creates two numbers and calculates modulo from dividing one number at
	 * other.
	 * 
	 * @return result of modulo.
	 */
	public int modulus(int moneyForTeeth) {
		int cheatAmount = 0;
		// #5 Robert allowed brothers to pay 3 dollars every week, while
		// there are 3 dollars available. Robert is bad at math so he can be
		// cheated. For how much brothers have cheated?

		cheatAmount = moneyForTeeth % 3;
		return cheatAmount;
	}

	/**
	 * Creates integer and increases it by 1.
	 * 
	 * @return increased value
	 */
	public int increment(int teethCount) {
		// #6 Doctors were able to fix one teeth.
		// Please increase number of Robert's teeth by one

		int result = teethCount;
		result++;
		return result;
	}

}
