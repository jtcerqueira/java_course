/*
 * Time.java
 * ----------------------------------
 * 1. This program is made as an exercise to use some arithmetic.
 * 2. Start thinking about compound entities (like time of day)
 *	  that are represented with multiple values.
 */

public class Time {

	public static void main(String[] args) {
		
		//variables
		int hour = 14, minute = 25, second = 30;
		int secondsSinceMidnight = (hour * 3600) + (minute * 60) + second;
		int secondsOfDay = 24 * 3600;
		double percentageOfDayPassed = (100 * secondsSinceMidnight) / secondsOfDay;
		
		
		System.out.println("Seconds since midnight: " + secondsSinceMidnight + "s"); //ex.3
		System.out.println("Seconds remaining in the day: " + (secondsOfDay - secondsSinceMidnight) + "s");//ex.4
		System.out.println("Percentage of a day passed: " + percentageOfDayPassed + "%");//ex.5
		
		//variable changed to demonstrate elapsed time when I have the finished exercise.
		int hourElapsed = 14, minuteElapsed = 46, secondElapsed = 30;
		int timeElapsed = (hourElapsed * 3600) + (minuteElapsed * 60) + secondElapsed;
		
		System.out.println("Seconds Elapsed since I started this exercise: " + (timeElapsed - secondsSinceMidnight) + "s"); //ex.6		
	}
}
