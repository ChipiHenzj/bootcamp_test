package main.java.org.activity20;

import java.util.List;
// TODO uncomment next line
//import java.util.function.Predicate;

public class LambdaClass {

	public String executeLambda(List<Integer> list) {
		StringBuffer tmp = new StringBuffer();
		// TODO uncomment next block of code
		// // add all numbers
		// tmp.append(evaluate(list, (n) -> true));
		//
		// // Add even numbers
		// tmp.append(evaluate(list, (n) -> n % 2 == 0));
		//
		// // Add odd numbers
		// tmp.append(evaluate(list, (n) -> n % 2 == 1));

		return tmp.toString();
	}

	// TODO uncomment next block of code
	// private String evaluate(List<Integer> list,
	// Predicate<Integer> predicate) {
	// StringBuffer tmp = new StringBuffer("");
	// for (Integer n : list) {
	// if (predicate.test(n)) {
	// tmp.append(n + " ");
	// }
	// }
	// return tmp.toString();
	// }

}