package main.java.org.activity16;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import antlr.collections.List;

public class RegEx {

	/**
	 * This method finds out if we can make lucky number from numbers in input
	 * string. Lucky number is number with digit summ equal to 25
	 * 
	 * @param string
	 *            , needed to be checked
	 * @return true if numbers in this number are lucky, false if not.
	 */public static void main (String [] args){
		 
	 }
	
	
	public boolean isLuckyNumber(String input) {

		// TODO #1 Remove all non digits from the input.
		// HINT: use negation pattern.
		String numbers = input.replaceAll("[^0-9]", "");

		// TODO #2 count the sum of all digits, and check if the sum is lucky

		String[] number = numbers.split("");
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			try {
				sum += Integer.parseInt(number[i]);
			} catch (Exception e) {
			}
		}
		
		if ( sum == 25){
			return true;
		} else{
			return false;
		}

	}

	/**
	 * This method finds Kenny, hiding in this list. You can kill him if you
	 * want. List always starts from letter.
	 * 
	 * @param infoList
	 *            - name list with random delimiters.
	 * @return position of "Kenny" string. If there are no Kenny returns -1.
	 */
	public int findKenny(String infoList) {
		// TODO #3 get list with names from the input

		String numbers = infoList.replaceAll("[^a-zA-Z]+","");
		
		// TODO #4 parse this list to find Kenny.
		if(numbers.contains("Kenny")){
			String[] parts = numbers.split("(?=\\p{Upper})");
			for(int i = 0; i < parts.length; ++i){
				if(parts[i].equals("Kenny")){
					return i - 1;
				}
			}
		}
		return -1;
	}

	/**
	 * THis method checks if input string is correct telephone number. Correct
	 * Riga phone number starts with 67 or 66 and is followed by 6 other digits.
	 * not obligate prefix +371
	 * 
	 * @param telephoneNumber
	 *            - number, needed to be checked.
	 * @return true if number is valid Riga city number.
	 */
	public boolean isGood(String telephoneNumber) {
		boolean status = false;
		// TODO #5 check with "matches" method if this number is valid.
		
//		String regexStr = "^(+371\\-)?[6]{3}\\-?[0-9]{3}\\-?[0-9]{4}$";
		if(telephoneNumber.contains("+")){
			telephoneNumber = telephoneNumber.replace("+", "");
		}
		if(telephoneNumber.contains("371")){
			telephoneNumber = telephoneNumber.replaceAll("371", "");
		}
		String regexStr = "6[6-7]\\d\\d\\d\\d\\d\\d$";
		return telephoneNumber.matches(regexStr);
		
//		return status;
	}
}
