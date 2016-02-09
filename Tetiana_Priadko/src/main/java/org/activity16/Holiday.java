package main.java.org.activity16;

import junit.framework.Assert;

/**
 * This enum represents holidays, displayed as month + day value. This enum can
 * give nearest holiday.
 */
public enum Holiday {
	NEW_YEAR(1, 1), WOMAN_DAY(3, 8), CHUCK_NORRIS_BIRTHSDAY(3, 10), FOOLS_DAY9(
			4, 1), WORLD_END(12, 21);
	int month;
	int day;

	Holiday(int month, int day) {
		// TODO #1 implement class variables for month and day of the holiday
		this.month = month;
		this.day = day;
	}

	public static void main(String[] args){
		Assert.assertEquals(Holiday.NEW_YEAR, Holiday.getNearest(12, 31));
		Assert.assertEquals(Holiday.CHUCK_NORRIS_BIRTHSDAY, Holiday.getNearest(3, 9));
	}
	
	public static Holiday getNearest(int currentMonth, int currentDay) {
		Holiday returnHoliday = null;
		// TODO #2 implement method which will return the nearest holiday.
		// HINT: note, that holidays is arranged by date ascending, so if there
		// are
		// no more holidays this year, first holiday in the list will be the
		// next.
		
		if(currentMonth >= 1 && currentMonth < 3){
			returnHoliday = Holiday.WOMAN_DAY;
		} else if(currentMonth == 3){
			if (currentDay <= 8) {
				returnHoliday = Holiday.WOMAN_DAY;
			} else if(currentDay > 8 && currentDay <= 10){
				returnHoliday = Holiday.CHUCK_NORRIS_BIRTHSDAY;
			} else {
				returnHoliday = Holiday.FOOLS_DAY9;
			}
		} else if(currentMonth > 3 && currentMonth < 4){
			returnHoliday = Holiday.FOOLS_DAY9;
		} else if (currentMonth == 4) {
			if (currentDay == 1) {
				returnHoliday = Holiday.FOOLS_DAY9;
			}
		} else if (currentMonth > 4 && currentMonth < 12) {
			returnHoliday = Holiday.WORLD_END;
		} else if (currentMonth == 12) {
			if (currentDay <= 21) {
				returnHoliday = Holiday.WORLD_END;
			} else {
				returnHoliday = Holiday.NEW_YEAR;
			}
		}
		
		return returnHoliday;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
}
