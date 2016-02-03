package main.java.org.activity18;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static test.java.org.TestUtils.handleError;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class StudentManagerTest1 {
	// Necessary structure for the test
	private static Connection CONN; // connection to the DB
	private static String URL; // URL to the DB
	private static String USER; // user
	private static String PASS; // password
	private static StudentManager manager;

	@BeforeClass
	// Do not change name and annotation of this method!
	public static void setUp() throws Exception {
		// Create JDBC connection to the database with necessary values
		URL = "jdbc:mysql://localhost/database_activity";
		USER = "root";
		PASS = "abcd1234";
		Class.forName("com.mysql.jdbc.Driver");
		CONN = DriverManager.getConnection(URL, USER, PASS);
		CONN.setAutoCommit(false);
		manager = new StudentManager(CONN);
		// you can use connection and/or manager objects for your tests
	}

	// TODO implement methods which test all features of Student and
	// StudentManager.
	// Name test methods starting as "test..."
	@Test
	public void testSomething() {fail();}

	@AfterClass
	// Do not change name and annotation of this method!
	public static void tearDown() {
		// TODO Do necessary things in this method when tests are finished
	}

}
