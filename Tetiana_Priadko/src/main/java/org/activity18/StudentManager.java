package main.java.org.activity18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Create JUnit test for Student class. If you found bugs in this code, just fix it. 
// Use EclEmma, try check what is code coverage. Try to reach as much coverage as possible.

public class StudentManager {
	private static Connection conn;

	public StudentManager(Connection conn) {
		// save passed connection object into local conn object
		// and use it in all methods
		StudentManager.conn = conn;
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns a list of Student object that contain the specified first name
	 * and last name. This will return an empty List of no match is found.
	 * 
	 * @param firstName
	 *            the first name of student.
	 * @param lastName
	 *            the last name of student.
	 * @return a list of Student object.
	 */
	public List<Student> findStudent(String firstName, String lastName)
			throws Exception {

		List<Student> results = new ArrayList<Student>();

		PreparedStatement pStmt = conn
				.prepareStatement("select * from Student where upper(FIRSTNAME) LIKE "
						+ "'%"
						+ firstName.toUpperCase()
						+ "%'"
						+ " and upper(LASTNAME) LIKE "
						+ "'%"
						+ lastName.toUpperCase() + "%'" + " order by ID ASC");

		ResultSet rs = pStmt.executeQuery();
		while (rs.next()) {
			results.add(new Student(rs.getInt("ID"), rs.getString("FIRSTNAME"),
					rs.getString("LASTNAME")));
		}
		rs.close();
		pStmt.close();

		return results;

	}

	/**
	 * Returns a Student instance represented by the specified ID.
	 * 
	 * @param id
	 *            the ID of student
	 * @return a Student object
	 * @throws SQLException
	 */
	public Student findStudent(int id) throws SQLException {

		PreparedStatement pStmt = null;
		pStmt = conn
				.prepareStatement("SELECT * FROM Student WHERE id = ? ");

		pStmt.setInt(1, id);
		ResultSet rs = pStmt.executeQuery();
		rs.next();
		return new Student(rs.getInt(1), rs.getString(2), rs.getString(3));

	}

	/**
	 * This method will attempt to insert an new student (first name and last
	 * name) into the repository.
	 * 
	 * @param firstName
	 *            the first name of student
	 * @param lastName
	 *            the last name of student
	 * @return true if insert, else false.
	 * @throws SQLException
	 */

	public boolean insertStudent(String firstName, String lastName)
			throws SQLException {
		PreparedStatement pStmt = conn
				.prepareStatement("insert into student (firstname, lastname)"
						+ " VALUES (?,?)");
		pStmt.setString(1, firstName);
		pStmt.setString(2, lastName);
		pStmt.executeUpdate();
		conn.commit();
		return true;
	}

	/**
	 * This method will attempt to insert an student's (id, first name and last
	 * name) into the repository.
	 * 
	 * @param id
	 *            the ID of student
	 * @param firstName
	 *            the first name of student
	 * @param lastName
	 *            the last name of student
	 * @return true if insert, else false.
	 * @throws SQLException
	 */
	public boolean insertStudentAll(int id, String firstName, String lastName)
			throws SQLException {

		PreparedStatement pStmt = conn
				.prepareStatement("insert into Student (id, firstname, lastname) VALUES (?, ?,?)");

		pStmt.setString(1, Integer.toString(id));
		pStmt.setString(2, firstName);
		pStmt.setString(3, lastName);
		pStmt.executeUpdate();
		conn.commit();
		return true;
	}

	/**
	 * Updates an existing Student in the repository with the values represented
	 * by the Student object.
	 * 
	 * @param student
	 *            a Student object, which contain information for updating.
	 * @return true if row was updated.
	 * @throws SQLException
	 */
	public boolean updateStudent(Student student) throws SQLException {

		PreparedStatement pStmt = conn
				.prepareStatement("update Student set FIRSTNAME = ?, LASTNAME = ? "
						+ "where ID = ?");

		pStmt.setString(1, student.getFirstName());
		pStmt.setString(2, student.getLastName());
		pStmt.setInt(3, student.getID());

		int rows = pStmt.executeUpdate();

		conn.commit();
		pStmt.close();

		if (rows == 1) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Delete an existing Student in the repository with the values represented
	 * by the ID.
	 * 
	 * @param id
	 *            the ID of student.
	 * @return true if row was deleted.
	 * @throws SQLException
	 */

	public boolean deleteStudent(int id) throws SQLException {

		PreparedStatement pStmt = conn
				.prepareStatement("DELETE FROM STUDENT WHERE ID = " + id);

		int rows = pStmt.executeUpdate();

		conn.commit();
		pStmt.close();

		if (rows == 1) {
			return true;
		} else {
			return false;
		}
	}
}
