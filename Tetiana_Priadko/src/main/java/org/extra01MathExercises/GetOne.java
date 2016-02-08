package main.java.org.extra01MathExercises;

public class GetOne {

	public static void main(String[] args) {
		GetOne test = new GetOne();
		System.out.println(test.maxNumbers(5));
	}

	public int numbCount(int number) {
		// #1: Implement method which processes the passed value until it's
		// reduced to 1.
		// If the number is even then divide it by 2. If it is odd then multiply
		// it by 3 and add 1. Count how many iterations
		// it takes to do this calculation and return that count. For example:
		// passed number is 6. Path to completion would be:
		// 6->3->10->5->16->8->4->2->1. Iteration count=8.
		// HINT: Use while loop.
		int iterationCount = 0;

		while (number != 1) {
			if ((number % 2) == 0) {
				number /= 2;
				iterationCount++;
			} else {
				number *= 3;
				number++;
				iterationCount++;
			}
		}
		return iterationCount;
	}

	public int maxNumbers(int numberlimit) {
		int longestPath = 0;
		// TODO #2: Calculate how many iterations each number from 1 to
		// numberlimit (excluding numberlimit itself) needs to get value till 1.
		// Return the number, which takes most iterations to do that.

		while ((numberlimit-1) != 1) {
			numberlimit--;
			longestPath++;
			if ((numberlimit % 2) == 0) {
				numberlimit /= 2;
				longestPath++;
			} else {
				numberlimit *= 3;
				numberlimit++;
				longestPath++;
			}
		}
		
		
		return longestPath;
	}
}