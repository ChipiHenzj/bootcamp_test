package main.java.org.activity13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Database {

	int id;
	String firstName;
	String lastName;
	private Connection conn;

	/**
	 * This code create connection to database
	 * 
	 * @param conn
	 */

	public Database(Connection conn) {
		this.conn = conn;
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns a list of Teacher object that contain the specified first name
	 * and last name. This will return an empty List of no match is found.
	 * 
	 * @param firstName
	 *            the first name of teacher.
	 * @param lastName
	 *            the last name of teacher.
	 * @return a list of Teacher object.
	 */
	public List<Teacher> findTeacher(String firstName, String lastName)
			throws Exception {
		List<Teacher> results = new ArrayList<Teacher>();
		// TODO #1 Write an sql statement that searches teacher by first and
		// last name and returns results as ArrayList<Teacher>.
		// Note that search results of partial match
		// in form ...like '%value%'... should be returned
		return results;
	}

	/**
	 * Returns a Teacher instance represented by the specified ID.
	 * 
	 * @param id
	 *            the ID of teacher
	 * @return a Teacher object
	 * @throws SQLException
	 */
	public Teacher findTeacher(int id) throws SQLException {
		Teacher teacher = new Teacher(0, null, null);
		// TODO #2 Write an sql statement that searches teacher by ID.
		return teacher;
	}

	/**
	 * This method will attempt to insert an new teacher (first name and last
	 * name) into the repository.
	 * 
	 * @param firstName
	 *            the first name of teacher
	 * @param lastName
	 *            the last name of teacher
	 * @return true if insert, else false.
	 * @throws SQLException
	 */

	public boolean insertTeacher(String firstName, String lastName)
			throws SQLException {
		boolean status = false;
		// TODO #3 Write an sql statement that inserts teacher in database.
		return status;
	}

	/**
	 * This method will attempt to insert an teacher's (id, first name and last
	 * name) into the repository.
	 * 
	 * @param id
	 *            the ID of teacher
	 * @param firstName
	 *            the first name of teacher
	 * @param lastName
	 *            the last name of teacher
	 * @return true if insert, else false.
	 * @throws SQLException
	 */
	public boolean insertTeacherAll(int id, String firstName, String lastName)
			throws SQLException {
		boolean status = false;
		// TODO #4 Write an sql statement that inserts teacher in database.
		return status;
	}

	/**
	 * Updates an existing Teacher in the repository with the values represented
	 * by the Teacher object.
	 * 
	 * @param teacher
	 *            a Teacher object, which contain information for updating.
	 * @return true if row was updated.
	 * @throws SQLException
	 */
	public boolean updateTeacher(Teacher teacher) throws SQLException {
		boolean status = false;
		// TODO #5 Write an sql statement that updates teacher information.
		return status;
	}

	/**
	 * Delete an existing Teacher in the repository with the values represented
	 * by the ID.
	 * 
	 * @param id
	 *            the ID of teacher.
	 * @return true if row was deleted.
	 * @throws SQLException
	 */
	public boolean deleteTeacher(int id) throws SQLException {
		boolean status = false;
		// TODO #6 Write an sql statement that deletes teacher from database.
		return status;
	}
}
