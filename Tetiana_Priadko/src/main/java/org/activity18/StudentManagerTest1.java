package main.java.org.activity18;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static test.java.org.TestUtils.handleError;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.ibatis.common.jdbc.ScriptRunner;

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

	// implement methods which test all features of Student and
	// StudentManager.
	// Name test methods starting as "test..."
	// @Test
	// public void testSomething() {fail();}

	@AfterClass
	// Do not change name and annotation of this method!
	public static void tearDown() {
		// Do necessary things in this method when tests are finished
		try {
			CONN.close();
		} catch (SQLException var1) {
			fail();
		}
	}

	@Test
	public void testFindStudent() throws Exception {
		StudentManager db = new StudentManager(CONN);

		try {
			List<Student> e = db.findStudent("NA", "T");
			assertEquals(1L, (long) e.size());
			assertEquals(1L, (long) ((Student) e.get(0)).getID());
			assertEquals("ANNA", ((Student) e.get(0)).getFirstName()
					.toUpperCase());
			assertEquals("TRESS", ((Student) e.get(0)).getLastName()
					.toUpperCase());
			e = db.findStudent("IANA", "DOS");
			assertEquals(1L, (long) e.size());
			assertEquals(2L, (long) ((Student) e.get(0)).getID());
			assertEquals("DIANA", ((Student) e.get(0)).getFirstName()
					.toUpperCase());
			assertEquals("DOS", ((Student) e.get(0)).getLastName()
					.toUpperCase());
		} catch (Throwable var3) {
			fail();
		}

	}

	@Test
	public void testFindID() throws Exception {
		StudentManager db = new StudentManager(CONN);

		try {
			Student e = db.findStudent(1);
			assertEquals("ANNA", e.getFirstName().toUpperCase());
			assertEquals("TRESS", e.getLastName().toUpperCase());
			e = db.findStudent(2);
			assertEquals("DIANA", e.getFirstName().toUpperCase());
			assertEquals("DOS", e.getLastName().toUpperCase());
		} catch (Throwable var3) {
			fail();
		}

	}

}
