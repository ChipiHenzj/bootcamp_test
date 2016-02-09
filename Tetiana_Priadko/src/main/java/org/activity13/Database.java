package main.java.org.activity13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import main.java.org.activity18.Student;

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

	public static void main(String[] args){
		
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
		
		
		PreparedStatement pStmt = conn
				.prepareStatement("select * from Teacher where upper(FIRSTNAME) LIKE " + "'%" + firstName.toUpperCase() + "%'" 
						+ " and upper(LASTNAME) LIKE " + "'%" + lastName.toUpperCase() + "%'" + " order by ID ASC");

		ResultSet rs = pStmt.executeQuery();
		
		while (rs.next()) {
			results.add(new Teacher(rs.getInt("ID"), rs.getString("FIRSTNAME"),
					rs.getString("LASTNAME")));
		}

		rs.close();
		pStmt.close();

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
		PreparedStatement pStmt = null;
		pStmt = conn
				.prepareStatement("SELECT * FROM Teacher WHERE id = ? ");

		pStmt.setInt(1, id);
		ResultSet rs = pStmt.executeQuery();
		rs.next();
		
		teacher = new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3));

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
		
		PreparedStatement pStmt = conn
				.prepareStatement("insert into Teacher (firstname, lastname)"
				+ " VALUES (?,?)");
				pStmt.setString(1, firstName);
				pStmt.setString(2, lastName);
				pStmt.executeUpdate();
				conn.commit();
		
		status =  true;
		
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
		PreparedStatement pStmt = conn
				.prepareStatement("insert into Teacher (id, firstname, lastname) VALUES (?,?,?)");

		pStmt.setString(1, Integer.toString(id));
		pStmt.setString(2, firstName);
		pStmt.setString(3, lastName);
		pStmt.executeUpdate();
		conn.commit();
		
		status = true;
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
		PreparedStatement pStmt = conn
				.prepareStatement("update Teacher set FIRSTNAME = ?, LASTNAME = ? "
						+ "where ID = ?");

		pStmt.setString(1, teacher.getFirstName());
		pStmt.setString(2, teacher.getLastName());
		pStmt.setInt(3, teacher.getID());

		int rows = pStmt.executeUpdate();

		conn.commit();
		pStmt.close();

		if (rows == 1) {
			status = true;
		} else {
			status = false;
		}

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
		PreparedStatement pStmt = conn
				.prepareStatement("DELETE FROM Teacher WHERE ID = " + id);

		int rows = pStmt.executeUpdate();

		conn.commit();
		pStmt.close();

		if (rows == 1) {
			status = true;
		} else {
			status = false;
		}

		return status;
	}
}
