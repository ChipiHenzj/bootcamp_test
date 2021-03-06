package main.java.org.activity10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Assert;

public class ReaderAndWriter {

	private static final String purrFileName = "purr.txt";
	private static final String woofFileName = "woof.txt";
	private static final String mainDir = "src/main/java/org/activity10";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// #1: Create purr.txt in folder with program file
		createPurrFile();

		// #2: Print in console woof.txt
		readFromWoofOutToConsole();

		// Save the content of woof.txt to purr.txt,replace all
		// "puppy" words to "kitty", and
		// all "woof" to "purr" in purr.txt.

		writeToPurrFileFromString(readFromWoofOutToString());
		String result = writeToPurrFileFromString(readFromWoofOutToString());
		result = replaceInString(result);

		writeToPurrFileFromString(result);

		// # 3 Print purr.txt in console.

		readFromPurrOutToConsole();
	}

	public static void createPurrFile() {
		File purrFile = new File(mainDir, purrFileName);

		try {

			BufferedReader in = new BufferedReader(new InputStreamReader(
					System.in));

			PrintWriter out = new PrintWriter(new FileWriter(purrFile));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFromWoofOutToConsole() {
		String line = null;

		File woofFile = new File(mainDir, woofFileName);

		try {

			FileReader fileReader = new FileReader(woofFile);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			bufferedReader.close();
		} catch (FileNotFoundException ex) {

		} catch (IOException ex) {

		}
	}

	public static void readFromPurrOutToConsole() {
		String line = null;

		File purrFile = new File(mainDir, purrFileName);

		try {
			FileReader fileReader = new FileReader(purrFile);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			bufferedReader.close();
		} catch (FileNotFoundException ex) {

		} catch (IOException ex) {

		}
	}

	public static String readFromWoofOutToString() {
		String line = null;

		File woofFile = new File(mainDir, woofFileName);
		String result = "";
		try {
			FileReader fileReader = new FileReader(woofFile);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				result += line + "\n";
			}

			bufferedReader.close();
			return result;
		} catch (FileNotFoundException ex) {
			return result;
		} catch (IOException ex) {
			return result;
		}
	}

	public static String writeToPurrFileFromString(String result) {
		File purrFile = new File(mainDir, purrFileName);

		try {
			FileWriter fileWriter = new FileWriter(purrFile);

			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write(result);

			bufferedWriter.close();
			return result;
		} catch (IOException ex) {
			return result;
		}
	}

	public static String replaceInString(String result) {
		return result.replaceAll("puppy", "kitty").replaceAll("woof", "purr");
	}
}
