package main.java.org.activity16;

import java.util.LinkedList;

public class Generics<E extends Number> extends LinkedList<E> {

	private static final long serialVersionUID = 1L;

	/**
	 * return E the top element of the stack
	 */
	// #1 : Override LinkedList class method "pop" to make it print element
	// classes before calling parent method.

	public static void main (String[] args){
		Generics<Number> generics = new Generics<>();
		generics.run();
	}
	
	@Override
	public E pop() {
		E result = null;
		result = super.pop();
		System.out.println(result.getClass().getName());
		return result;
	}

	/**
	 * This method runs generic demonstration.
	 */

	@SuppressWarnings("unchecked")
	public void run() {
		// #2 : push to the list one double type element, one integer value
		// one long value and one float Value.
		// Note that we can't push for example String values.

		super.add((E) new Double(1.1D));
		super.add((E) new Integer(1));
		super.add((E) new Long(1L));
		super.add((E) new Float(1.1F));

		for (int i = size() - 1; i >= 0; i--) {
			System.out.println(get(i).getClass().getName());
		}

		// #3 : pop all elements from the array
		removeAll(this);
	}
}
