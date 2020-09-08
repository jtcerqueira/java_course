/*
 * Date.java
 * ---------------------------
 * From exercise 4.3 on the exercise
 * part from chapter 4. This program is supposed to print
 * in American format and European as well.
 */

public class Date {

	
	public static void main(String[] args) {
		
		String day, month;
		int date, year;
		
		printAmerican("Tuesday", "September", 8, 2020);
		printEuropean("Tuesday", 8, "September", 2020);
	}
	
	public static void printAmerican(String day, String month, int date, int year) {
		
		System.out.println("American Standard date -> " + day + " " + month + " " + date + ", " + year + ".");
	}
	
	public static void printEuropean(String day, int date, String month, int year) {
		System.out.println("European Standard date -> " + day + " " + date + " " + month + ", " + year + ".");
	}

}
