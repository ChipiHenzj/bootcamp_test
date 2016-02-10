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

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
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

	// TODO implement methods which test all features of Student and
	// StudentManager.
	// Name test methods starting as "test..."
//	@Test
//	public void testSomething() {fail();}
	
	@AfterClass
    public static void tearDown() {
        try {
            CONN.close();
        } catch (SQLException var1) {
            fail();
        }

    }

    @Test
    public void testFindID() throws Exception {
        StudentManager db = new StudentManager(CONN);

        try {
            Student e = db.findStudent(1);
            Assert.assertEquals("ANNA", e.getFirstName().toUpperCase());
            Assert.assertEquals("TRESS", e.getLastName().toUpperCase());
            e = db.findStudent(2);
            Assert.assertEquals("DIANA", e.getFirstName().toUpperCase());
            Assert.assertEquals("DOS", e.getLastName().toUpperCase());
        } catch (Throwable var3) {
            fail();
        }

    }

    @Test
    public void testFindStudent() throws Exception {
        StudentManager db = new StudentManager(CONN);

        try {
            List e = db.findStudent("NA", "T");
            Assert.assertEquals(1L, (long)e.size());
            Assert.assertEquals(1L, (long)((Student)e.get(0)).getID());
            Assert.assertEquals("ANNA", ((Student)e.get(0)).getFirstName().toUpperCase());
            Assert.assertEquals("TRESS", ((Student)e.get(0)).getLastName().toUpperCase());
            e = db.findStudent("IANA", "DOS");
            Assert.assertEquals(1L, (long)e.size());
            Assert.assertEquals(2L, (long)((Student)e.get(0)).getID());
            Assert.assertEquals("DIANA", ((Student)e.get(0)).getFirstName().toUpperCase());
            Assert.assertEquals("DOS", ((Student)e.get(0)).getLastName().toUpperCase());
        } catch (Throwable var3) {
            fail();
        }

    }

    @Test
    public void testInsertStudent() throws Exception {
        StudentManager db = new StudentManager(CONN);

        try {
            String e = "testF";
            String lname = "testL";
            boolean result = db.insertStudent(e, lname);
            Assert.assertTrue(result);
        } catch (Throwable var5) {
            fail();
        }

    }

    @Test
    public void testInsertStudentAll() throws Exception {
        StudentManager db = new StudentManager(CONN);

        try {
            boolean e = db.insertStudentAll(4, "Just", "Test");
            Assert.assertTrue(e);
        } catch (Throwable var3) {
            fail();
        }

    }

    @Test
    public void testUpdateStudent() throws Exception {
        StudentManager db = new StudentManager(CONN);

        try {
            Student e = new Student(5, "She Will", "B. Deleted");
            boolean result = db.updateStudent(e);
            Assert.assertTrue(result);
        } catch (Throwable var4) {
            fail();
        }

    }

    @Test
    public void testDeleteStudent() throws Exception {
        StudentManager db = new StudentManager(CONN);

        try {
            boolean e = db.deleteStudent(4);
            Assert.assertTrue(e);
        } catch (Throwable var3) {
            fail();
        }

    }

    private int deletetStudent(String fname, String lname) {
        byte result = -1;

        try {
        	CONN = DriverManager.getConnection(URL, USER, PASS);
        	CONN.setAutoCommit(false);
            PreparedStatement e = CONN.prepareStatement("delete from Student where firstname = ? and lastname = ? ");
            e.setString(1, fname);
            e.setString(2, lname);
            int result1 = e.executeUpdate();
            CONN.commit();
            e.close();
            return result1;
        } catch (SQLException var5) {
            return result;
        }
    }

    public static void resetDatabase(Connection conn) throws SQLException, IOException {
        ScriptRunner sr = new ScriptRunner(conn, false, false);
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/org/activity13/database.sql"));
        sr.runScript(reader);
    }

}
