package io.fp.nextday2;

public class Date {
    
    private int day;
    private Month month;
    private int year;

    public Date(int day, Month month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;        
    }

    public Date getNextDay(){

        return new Date(this.day, this.month, this.year);
    }

    public boolean isLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0) {
			return true;
		}
        else if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0){
                return true;
        }
        else {
            return false;
        }
       
    }

    public boolean islongMonth(Month month) {

        switch(month){
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                return true;
        }
        return false;
    }

    public boolean correctDate() throws DateException{
        if (this.day > 32){
            throw new DateException();
        }
        return true;
    }

    @Override
    public String toString() {
        return day+"."+(month.ordinal()+1)+"."+year;
    }

    
}
