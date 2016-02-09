package main.java.org.activity16;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;

import org.junit.Assert;

public class Generics<E extends Number> extends LinkedList<E> {

	private final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private static final long serialVersionUID = 1L;

	/**
	 * return E the top element of the stack
	 */
	// TODO #1 : Override LinkedList class method "pop" to make it print element
	// classes before calling parent method.

	@Override
	public E pop() {
		
		E result = super.pop();
		System.out.println(result.getClass().getName());

		return result;
		
	}
	
	public static void main (String[] args){
//		System.setOut(new PrintStream(outContent));
		Generics<Number> generics = new Generics<>();
		generics.add(new Double(2.2D));
		generics.run();
		Assert.assertEquals(false, generics.isEmpty());
//        Assert.assertEquals("Java.lang.Float\nJava.lang.Long\nJava.lang.Integer\nJava.lang.Double\n".toUpperCase(), outContent.toString().toUpperCase());
	}

	/**
	 * This method runs generic demonstration.
	 */

	@SuppressWarnings("unchecked")
	public void run() {
		// TODO #2 : push to the list one double type element, one integer value
		// one long value and one float Value.
		// Note that we can't push for example String values.

		
		super.add((E) new Double(2.2D));
		super.add((E) new Integer(1));
		super.add((E) new Long(2L));
		super.add((E) new Float(2.2F));
		
		for(int i = size() - 1; i >= 0; --i){
			System.out.println(get(i).getClass().getName());
		}
		
		// TODO #3 : pop all elements from the array
		removeAll(this);
	}
}
