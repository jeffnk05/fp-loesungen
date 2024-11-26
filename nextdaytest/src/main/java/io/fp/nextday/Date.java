package io.fp.nextday;

public class Date {

	private int day;
	private Month month;
	private int year;
	
	public Date(int day, Month month, int year) throws DateException {	
		validateDate(day, month, year);
		this.day = day;
		this.month = month;
		this.year = year;	
	}
	
	public Date getNextDay() {

		try {
			Date newDate = new Date(day, month, year);

			if (day == 29 & month == Month.FEBRUARY) {
				newDate.setDay(1);
				newDate.setMonth(Month.MARCH);
				return newDate;
			}

			if (day == 28 & month == Month.FEBRUARY & isLeapYear(year)) {
				newDate.setDay(29);
				return newDate;
			}

			if (day == 28 & month == Month.FEBRUARY & !isLeapYear(year)) {
				newDate.setDay(1);
				newDate.setMonth(Month.MARCH);
				return newDate;
			}

			if (!isLongMonth(month) && day == 30) {
				newDate.setDay(1);
				newDate.setMonth(month.getNextMonth());
				return newDate;
			}
			if (day == 31) {
				newDate.setDay(1);
				if (month == Month.DECEMBER) {
					newDate.setMonth(Month.JANUARY);
					newDate.setYear(year + 1);
				} else {
					newDate.setMonth(month.getNextMonth());
				}
				return newDate;
			}
			newDate.setDay(day + 1);
			return newDate;
		} catch (DateException e) {
			throw new RuntimeException("Wow, this should have been impossible! Either the algorithm is wrong or the validation is buggy!");
		}
	}
	
	private boolean isLeapYear(int year){
		if(year%400==0){
			return true;
		}
		if(year%4==0 & year%100!=0){
			return true;
		}
		return false;
	}
	
	private boolean isLongMonth(Month month) {
		
		switch (month) {
		case FEBRUARY:
		case APRIL:
		case JUNE:
		case SEPTEMBER:
		case NOVEMBER:
			return false;
		default:
			return true;
		}
	}
	private void validateDate(int day, Month month, int year) throws DateException {
		if(day>31 || day<1){
			throw new DateException("Invalid day.");
		}

		if(year<0){
			throw new DateException("Invalid year.");
		}
		
		if(!isLongMonth(month) & day>30){
			throw new DateException("Invalid day in month.");
		}
		
		if(!isLeapYear(year) & day>28 & month == Month.FEBRUARY){
			throw new DateException("Invalid day in month.");
		}
		
		if(isLeapYear(year) & day>29 & month == Month.FEBRUARY){
			throw new DateException("Invalid day in month.");
		}	
	}
	
	public String toString(){
		return day + "." + month + "." + year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) throws DateException {
		validateDate(day, month, year);
		this.day = day;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) throws DateException {
		validateDate(day, month, year);
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) throws DateException {
		validateDate(day, month, year);
		this.year = year;
	}	
}
