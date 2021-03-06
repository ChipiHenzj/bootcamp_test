package main.java.org.extra01MathExercises;

import java.util.ArrayList;
import java.util.List;

public class ArrayLookupMethods {
	List<Integer> myList = new ArrayList<Integer>();

	public List<Integer> checkArray(int comparator, int... numbers) {
		// #1:Implement method that compares values of passed array with
		// passed comparator.
		// Return list with values that are smaller than comparator.
		// Hint: Investigate how varargs are used.
		for (int i = 0; i < numbers.length; ++i) {
			if (numbers[i] < comparator) {
				myList.add(numbers[i]);
			}
		}
		return myList;
	}

	public int sumResult() {
		int sum = 0;
		// #2: Count element sum of the list
		for (Integer integer : myList) {
			sum += integer;
		}
		return sum;
	}
}
