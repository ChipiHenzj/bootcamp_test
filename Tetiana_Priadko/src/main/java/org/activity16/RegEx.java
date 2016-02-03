package main.java.org.activity16;

public class RegEx {

	/**
	 * This method finds out if we can make lucky number from numbers in input
	 * string. Lucky number is number with digit summ equal to 25
	 * 
	 * @param string
	 *            , needed to be checked
	 * @return true if numbers in this number are lucky, false if not.
	 */
	public boolean isLuckyNumber(String input) {

		// TODO #1 Remove all non digits from the input.
		// HINT: use negation pattern.
		String numbers = input.replaceAll("[^0-9]", "");

		// TODO #2 count the sum of all digits, and check if the sum is lucky
		return false;

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

		// TODO #4 parse this list to find Kenny.
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
		return status;
	}
}
