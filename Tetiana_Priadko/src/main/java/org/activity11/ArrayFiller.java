package main.java.org.activity11;

import java.util.Arrays;
import java.util.Random;

/**
 * Class which fills array of integers in current thread or separate threads
 * depending on invocation
 */
public class ArrayFiller implements Runnable {
	int[] array; // local reference to passed array
	int latency; // required latency to simulate real environment
	int minValue, maxValue; // min and max allowed values for array cells
	int from, to; // range which should be filled by this filler
	Random random; // Pseudo-random generator

//	 public static void main(String[] args) {
//	 int[] array = new int[]{0,1,2,3,4,5,6};
//	 ArrayFiller arrayFiller = new ArrayFiller(array, 2000, 10, 15);
//	
//	 Thread thread = new Thread(arrayFiller);
//	 thread.run();
//	 }

	public ArrayFiller(int[] array, int latency, int minValue, int maxValue) {
		// from this constructor call another constructor with more
		// parameters and fill missing
		// values with fixed literals
		this(array, latency, minValue, maxValue, 0, 6);
	}

	public ArrayFiller(int[] array, int latency, int minValue, int maxValue,
			int from, int to) {
		// save passed values to created filler object
		// Create and initialize pseudo-random generator. See more at:
		// http://docs.oracle.com/javase/7/docs/api/java/util/Random.html

		this.array = array;
		this.latency = latency;
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.from = from;
		this.to = to;

		Random random = new Random();
		this.random = random;
	}

	@Override
	public void run() {
		// when invoked, put filler to sleep for required amount of latency
		// then fill array between from..to range with random values in
		// minValue..maxValue range
		try {
			Thread.sleep(latency);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = from; i <= to; ++i){
			array[i] = (random.nextInt(maxValue - minValue) + minValue);
//			System.out.println(i);
//			System.out.println(array[i]);
		}
		
//		System.out.println(Arrays.toString(array));
	
	}

}
