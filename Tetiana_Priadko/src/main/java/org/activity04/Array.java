package main.java.org.activity04;

import java.util.Arrays;

public class Array {
	static int[] array;

	public static void main(String[] args) {
		// Use passed parameters for main method to initialize array
		// Hint: use Run— Run configurations... Arguments to pass parameters to
		// main method when calling from Eclipse
		// Sort elements in this array in ascending order
		// Hint: use Integer.parseInt(args[n]) to convert passed
		// parameters from String to int
		// Hint: use bubble sort, e.g.
		// http://mathbits.com/MathBits/Java/arrays/Bubble.html
		
		array = new int [args.length];
		
		for(int i = 0; i < args.length; i++){
			array[i] = Integer.parseInt(args[i]);
		}
		
		for (int i = array.length - 1; i > 0; i--){
			for (int j = 0; j < i; j++){
				if(array[j] > array[j+1]){
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			} 
		}
		
		printSortedArray();
		
	}

	public static void printSortedArray() {
		// print content of array on standard output
		// Hint: use Arrays.toString(array) method for this
		
		System.out.println(Arrays.toString(array));
		
	}

	public static int[] retrurnSortedArray() {
		// return reference to this array
		
		return array;
	}

}
