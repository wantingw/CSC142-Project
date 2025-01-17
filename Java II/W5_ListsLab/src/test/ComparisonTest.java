package test;

import spacex.Date;
import spacex.Time;
import spacex.Month;

public class ComparisonTest {
	
	public static void main(String[] args) {
		
		Date  date_01 		= new Date("14-Jul-09");
		Date  date_02		= new Date("5-Jan-09");
		Time  time_01		= new Time("22:30");
		Time  time_02		= new Time(01, 10);
		
		System.out.println("------- Enums -------------");
		Month month_01		= Month.MAY;
		Month month_02		= Month.JUN;
		System.out.println(month_01.ordinal());
		System.out.println(month_02.ordinal());
		System.out.println(month_01);
		System.out.println(month_02);
		System.out.println(month_01.name());
		System.out.println(month_02.name());
		System.out.println(month_02.compareTo(month_01));
		System.out.println(month_02.equals(month_01));
		System.out.println(month_02.equals(Month.JUN));
	
		//System.out.println(Month.valueOf("Apr"));
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("------- Dates ------------");
		System.out.println(date_01.compareTo(date_02));
		System.out.println(date_01.compareTo(new Date("12-Jul-09")));
		System.out.println(date_01.compareTo(new Date("14-Jul-08")));
		System.out.println(date_01.compareTo(new Date("14-Jul-09")));
		System.out.println(date_01.equals(new Date("14-Jul-09")));
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("------- Strings -------------");
		// n o p q r
		System.out.println("Arthur".compareTo("Andrew"));
		System.out.println("Andrew".compareTo("Arthur"));
		System.out.println("Andrew".compareTo("Borris"));
		
		// a b c d e f g h i j k l m n o
		System.out.println("Barry".compareTo("Borris"));
		
	}

}
