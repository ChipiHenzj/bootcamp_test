package main.java.org.activity03;

public class Zodiac {

	/**
	 * Determine the sign of the zodiac, use day and month.
	 * 
	 * @param day
	 * @param month
	 * @return zodiac
	 */
	public static String getZodiac(int day, int month) {
		String zodiac = null;
		// #1: Implement method which return zodiac sign names
		// As method parameter - day and month;
		// Look at wikipedia:
		// https://en.wikipedia.org/wiki/Zodiac#Table_of_dates
		// to get appropriate date ranges for signs

		if (month == 1) {
			if (day > 0 && day < 21) {
				zodiac = "Capricorn";
			} else if (day > 20 && day < 32) {
				zodiac = "Aquarius";
			} else {
				zodiac = "Wrong input";
			}
		} else if (month == 2) {
			if (day > 0 && day < 20) {
				zodiac = "Aquarius";
			} else if (day > 19 && day < 30) {
				zodiac = "Pisces";
			} else {
				zodiac = "Wrong input";
			}

		} else if (month == 3) {
			if (day > 0 && day < 21) {
				zodiac = "Pisces";
			} else if (day > 20 && day < 32) {
				zodiac = "Aries";
			} else {
				zodiac = "Wrong input";
			}

		} else if (month == 4) {
			if (day > 0 && day < 21) {
				zodiac = "Aries";
			} else if (day > 20 && day < 31) {
				zodiac = "Taurus";
			} else {
				zodiac = "Wrong input";
			}

		} else if (month == 5) {
			if (day > 0 && day < 22) {
				zodiac = "Taurus";
			} else if (day > 21 && day < 32) {
				zodiac = "Gemini";
			} else {
				zodiac = "Wrong input";
			}

		} else if (month == 6) {
			if (day > 0 && day < 22) {
				zodiac = "Gemini";
			} else if (day > 21 && day < 31) {
				zodiac = "Cancer";
			} else {
				zodiac = "Wrong input";
			}

		} else if (month == 7) {
			if (day > 0 && day < 23) {
				zodiac = "Cancer";
			} else if (day > 22 && day < 32) {
				zodiac = "Leo";
			} else {
				zodiac = "Wrong input";
			}

		} else if (month == 8) {
			if (day > 0 && day < 23) {
				zodiac = "Leo";
			} else if (day > 22 && day < 32) {
				zodiac = "Virgo";
			} else {
				zodiac = "Wrong input";
			}

		} else if (month == 9) {
			if (day > 0 && day < 23) {
				zodiac = "Virgo";
			} else if (day >= 23 && day < 31) {
				zodiac = "Libra";
			} else {
				zodiac = "Wrong input";
			}

		} else if (month == 10) {
			if (day > 0 && day < 23) {
				zodiac = "Libra";
			} else if (day >= 23 && day < 32) {
				zodiac = "Scorpio";
			} else {
				zodiac = "Wrong input";
			}

		} else if (month == 11) {
			if (day > 0 && day < 23) {
				zodiac = "Scorpio";
			} else if (day > 22 && day < 31) {
				zodiac = "Sagittarius";
			} else {
				zodiac = "Wrong input";
			}

		} else if (month == 12) {
			if (day > 0 && day < 22) {
				zodiac = "Sagittarius";
			} else if (day > 21 && day < 32) {
				zodiac = "Capricorn";
			} else {
				zodiac = "Wrong input";
			}

		} else if (month > 12) {
			zodiac = "Wrong input";
		}

		return zodiac;

	}

	public static void main(String[] args) {
		// HINT: you can use main method to test your getZodiac method with
		// different parameters
		System.out.println(getZodiac(23, 9));
	}

}
