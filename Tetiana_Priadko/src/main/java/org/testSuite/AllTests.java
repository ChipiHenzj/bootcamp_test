package main.java.org.testSuite;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import test.java.org.activity02.HelloTest;
import test.java.org.activity03.BasicMathFunctionsTest;
import test.java.org.activity03.OwlFarmTest;
import test.java.org.activity03.OwlTest;
import test.java.org.activity03.RandomPersonTest;
import test.java.org.activity03.ZodiacTest;
import test.java.org.activity04.ArrayTest;
import test.java.org.activity04.BlackKnightTest;
import test.java.org.activity04.If_SwitchTest;
import test.java.org.activity05.TrafficManagementTest;
import test.java.org.activity06.EncapsulationTest;
import test.java.org.activity07.AlienFromMarsTest;
import test.java.org.activity07.HumanTest;
import test.java.org.activity08.ExceptionsTest;
import test.java.org.activity09.ListSetMapTest;
import test.java.org.activity10.ReaderAndWriterTest;
import test.java.org.activity11.ArrayFillerManagerTest;
import test.java.org.activity12.ChatServerTest;
import test.java.org.activity13.DatabaseTest;
import test.java.org.activity14.XMLCarTest;
import test.java.org.activity15.AnimalTest;
import test.java.org.activity15.BirdTest;
import test.java.org.activity15.DogTest;
import test.java.org.activity15.HawkTest;
import test.java.org.activity15.MammalTest;
import test.java.org.activity16.GenericsTest;
import test.java.org.activity16.HolidayTest;
import test.java.org.activity16.RegExTest;
import test.java.org.activity17.CleverCrocodileStrategyTest;
import test.java.org.activity17.CrocodileGameTest;
import test.java.org.activity17.GreedyCrocodileStrategyTest;
import test.java.org.activity18.StudentManagerTest;
import test.java.org.activity19.ColorSliderTest;
import test.java.org.activity20.LambdaClassTest;
import test.java.org.extra01MathExercises.ArrayLookupMethodsTest;
import test.java.org.extra01MathExercises.GetOneTest;
import test.java.org.extra01MathExercises.MathExerciseTest;
import test.java.org.extra02LetsRide.LetsRideTest;
import test.java.org.extra03BridgePattern.BridgeMainTest;
import test.java.org.extra04ObserverPattern.ObserverMainTest;
import test.java.org.extra05StringTokenizer.StringTokenizerExerciseTest;
import test.java.org.extra05StringTokenizer.StudentTest;
import test.java.org.extra06JPA.InvoiceManagerTest;

// TODO should change design that tests are added to test suite dynamically
// so that test tree is properly shown in JUnit view

public class AllTests {
	Logger logger = Logger.getLogger(AllTests.class.getName());
	int totalTests = 0;
	int passedTests = 0;
	int totalExercises;
	float passedExercises = 0f;
	String exerciseNames = "";
	String exerciseResults = "";
	String curpack = "";
	String prevpack = "";

	@Test
	public void allTests() {
		printStat(
				// First week
				// Note that some of classes need to be invoked in correct order
				// to pass
				HelloTest.class,
				BasicMathFunctionsTest.class,
				ZodiacTest.class,
				OwlTest.class,
				OwlFarmTest.class,
				RandomPersonTest.class,
				ArrayTest.class,
				If_SwitchTest.class,
				BlackKnightTest.class,
				TrafficManagementTest.class,
				EncapsulationTest.class,
				AlienFromMarsTest.class,
				HumanTest.class,
				ExceptionsTest.class,
				ListSetMapTest.class,
				ReaderAndWriterTest.class,
				// Second week
				ArrayFillerManagerTest.class, ChatServerTest.class,
				DatabaseTest.class, XMLCarTest.class, AnimalTest.class,
				BirdTest.class, DogTest.class, HawkTest.class,
				MammalTest.class, GenericsTest.class, HolidayTest.class,
				RegExTest.class,
				CleverCrocodileStrategyTest.class,
				GreedyCrocodileStrategyTest.class,
				CrocodileGameTest.class,
				StudentManagerTest.class,
				ColorSliderTest.class,
				LambdaClassTest.class,
				// extra activities
				ArrayLookupMethodsTest.class, GetOneTest.class,
				MathExerciseTest.class, LetsRideTest.class,
				BridgeMainTest.class, ObserverMainTest.class,
				StringTokenizerExerciseTest.class, StudentTest.class,
				InvoiceManagerTest.class);

	}

	void printStat(Class<?>... classes) {

		for (Class<?> c : classes) {
			curpack = c.getPackage().getName();
			curpack = curpack.substring(curpack.lastIndexOf(".") + 1);
			logger.debug("Curpack:" + curpack + " Class: " + c.getSimpleName());
			if (!curpack.equals(prevpack) && !prevpack.equals("")) {
				collectEntries();
				totalTests = 0;
				passedTests = 0;
			}
			prevpack = curpack;
			// Get results from tested class
			Result result = null;
			try {
				result = JUnitCore.runClasses(c);
				int total = result.getRunCount();
				int failed = result.getFailureCount();
				int passed = total - failed;
				totalTests += total;
				passedTests += passed;
			} catch (Throwable t) {
				logger.error(t.toString());
			}
		}
		collectEntries();
		// Count global totals for the project
		String projectResults = "\nTotal result for exercises:\t="
				+ String.format("%.0f", passedExercises) + "/" + totalExercises;
		logger.info("\n" + exerciseNames + "\n" + exerciseResults + "\n"
				+ projectResults);

	}

	void collectEntries() {
		// count entries of previous package, if next package is started
		// or, if last class in project is achieved
		totalExercises++;
		exerciseNames = exerciseNames + prevpack + "\t";

		if (totalTests > 0) {
			exerciseResults = exerciseResults + "=" + passedTests + "/"
					+ totalTests + "\t";
			passedExercises = passedExercises + passedTests / totalTests;
		} else {
			exerciseResults = exerciseResults + "=0\t";
		}
		logger.debug("\n" + exerciseNames + "\n" + exerciseResults);
	}

}
