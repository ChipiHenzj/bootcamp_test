package main.java.org.activity11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import org.junit.Assert;

/**
 * This is frontend class for array filler. It uses ArrayFiller to fill array of
 * integers using sequental or concurrent (parallel) approach
 */
public class ArrayFillerManager {
	static int latency; // emulated latency in ms
	static int minValue, maxValue; // min and max (including) of the array cell
	static int[] array; // array to be filled
	static LinkedList<Thread> threads; // list of threads when parallel
										// filling is used

	// HINT feel free to use main() method for debugging purposes if unit tests
	// doesn't show enough information what exactly in implementation seems
	// wrong
	// Note that main method will not be used in unit tests.

	public static int[] setUp(int arraySize, int latency, int minValue,
			int maxValue) {
		// TODO save passed values in prepared structure
		// initialize array and list of threads
		// return reference to the created array
		
		ArrayFillerManager.latency = latency;
		ArrayFillerManager.minValue = minValue;
		ArrayFillerManager.maxValue = maxValue;
		
		ArrayFillerManager.array = new int[arraySize];
		ArrayFillerManager.threads = new LinkedList<>();
		
		return array;
	}
	
	public static void main(String[] args) {
        ArrayFillerManager.setUp(3, 1000, 0, 100);
        ArrayFillerManager.fillSequentally();
        ArrayFillerManager.fillParalelly();
        }

	public static void fillSequentally() {
		// TODO create cycle which creates new ArrayFiller objects
		// with filling range of only one cell (i.e. range from..to is 0..0,
		// then 1..1, etc.) and invoke .run() method for these objects.
		// Note, that invocation of .run() method directly executes it in
		// current thread.
		
		for(int i = 0; i < ArrayFillerManager.array.length; ++i){
			ArrayFiller arrayFiller 
			        = new ArrayFiller(ArrayFillerManager.array, latency, minValue, maxValue, i, i);
			Thread thread = new Thread(arrayFiller);
			threads.add(thread);
			thread.run();
		}
	}

	public static void fillParalelly() {
		// TODO create cycle which creates new ArrayFiller objects
		// with any range and pass them as references to the Thread constructor.
		// Add newly created Thread objects into threads list and start them
		// threads using .start() method. Note that invocation of .start() for
		// thread object creates new concurrent thread in application
		// Note that, to pass tests, this implementation should run faster than
		// fillSequentally() method.
		
		try {
			Thread.sleep(latency);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i < ArrayFillerManager.array.length; ++i){
			ArrayFiller arrayFiller 
			= new ArrayFiller(ArrayFillerManager.array, latency, minValue, maxValue, i, i);
			Thread thread = new Thread(arrayFiller);
			threads.add(thread);
			thread.start();
		}
	}
}
