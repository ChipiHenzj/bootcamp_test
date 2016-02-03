package main.java.org.activity20;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
// TODO uncomment next line
// import java.util.function.Predicate;

public class LambdaClassTest1 {
	private static Logger logger = Logger.getLogger(LambdaClassTest1.class
			.getName());

	@Test
	public void testLambdaClass() {
		List<Integer> list = new ArrayList<Integer>();
		Integer top = (int) (Math.random() * 20 + 1);
		for (Integer i = 0; i < top; i++)
			list.add(i);
		logger.debug("List: " + list);
		LambdaClass lambdaClass = new LambdaClass();
		try {
			assertNotEquals("", lambdaClass.executeLambda(list));
			assertEquals(testLambdas(list), lambdaClass.executeLambda(list));
			logger.info("OK");
		} catch (Throwable e) {
			logger.error("FAILED: message:" + e.getMessage() + " cause:"
					+ e.getCause());
			e.printStackTrace();
		}
	}

	private String testLambdas(List<Integer> list) {
		StringBuffer tmp = new StringBuffer();

		// TODO uncomment commented block
		// // add all numbers
		// tmp.append(evaluate(list, (n) -> true));
		// // Add even numbers
		// tmp.append(evaluate(list, (n) -> n % 2 == 0));
		// // Add odd numbers
		// tmp.append(evaluate(list, (n) -> n % 2 == 1));

		return tmp.toString();
	}

	// TODO uncomment next commented block
	// private String evaluate(List<Integer> list, Predicate<Integer> predicate)
	// {
	// StringBuffer tmp = new StringBuffer("");
	// for (Integer n : list) {
	// if (predicate.test(n)) {
	// tmp.append(n + " ");
	// }
	// }
	// return tmp.toString();
	// }

}
