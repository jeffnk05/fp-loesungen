package io.fp.nextday;

public class App {

	public static void main(String[] args)  throws DateException {
		
		Date date = new Date(31, Month.DECEMBER, 2020);
				
		System.out.println("Altes Datum: " + date );
		
		Date newdate = date.getNextDay();
				
		System.out.println("Neues Datum: " + newdate);
	}
}
