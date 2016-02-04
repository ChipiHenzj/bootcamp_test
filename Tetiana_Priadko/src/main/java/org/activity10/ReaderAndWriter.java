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
	public static void main(String[] args){      
        
    	// TODO #1: Create purr.txt in folder with program file
 		createPurrFile();
 		
 		// TODO #2: Print in console woof.txt
 		readFromWoofOutToConsole();
 		
 		// Save the content of woof.txt to purr.txt,replace all
 		// "puppy" words to "kitty", and
 		// all "woof" to "purr" in purr.txt.
 		
 		writeToPurrFileFromString(readFromWoofOutToString());
 		String result = writeToPurrFileFromString(readFromWoofOutToString());
 		result = replaceInString(result);
 		
 		writeToPurrFileFromString(result);
 		
 		// TODO # 3 Print purr.txt in console.	
 		
 		readFromPurrOutToConsole();
    }
	
	public static void createPurrFile() {
		File purrFile = new File(mainDir, purrFileName);
		
	    try {
	    	
	    	BufferedReader in
	        	= new BufferedReader(new InputStreamReader(System.in));
	     
	    	PrintWriter out = new PrintWriter(new FileWriter(purrFile));
	      
	    } catch (IOException e) { 
	      e.printStackTrace(); 
	    }
	}
	
	public static void readFromWoofOutToConsole(){
		String line = null;

        File woofFile = new File(mainDir, woofFileName);
        
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(woofFile);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

//            System.out.println("readFromWoofOutToConsole");
            
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
                          
        }
        catch(IOException ex) {
        	
        }
	}
	
	public static void readFromPurrOutToConsole(){
		String line = null;

        File purrFile = new File(mainDir, purrFileName);
        
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(purrFile);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
                          
        }
        catch(IOException ex) {
        	
        }
	}
	
	public static String readFromWoofOutToString(){
		String line = null;

        File woofFile = new File(mainDir, woofFileName);
        String result = "";
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(woofFile);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null) {
                result += line + "\n";
            }
           
//            System.out.println(result);

            // Always close files.
            bufferedReader.close(); 
            return result;
        }
        catch(FileNotFoundException ex) {
        	return result;
        }
        catch(IOException ex) {
            return result;
        }
	}
	
	public static String writeToPurrFileFromString(String result){
		File purrFile = new File(mainDir, purrFileName);

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(purrFile);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write(result);

            // Always close files.
            bufferedWriter.close();
            return result;
        }
        catch(IOException ex) {
            return result;
        }
	}
	
	public static String replaceInString(String result){
//		result = result.replaceAll("puppy", "kitty");
//		result = result.replaceAll("woof", "purr");
		
		return result.replaceAll("puppy", "kitty").replaceAll("woof", "purr");
		
//		System.out.println("\n" + "replaceInString");
//		System.out.println(result);
	}

}
