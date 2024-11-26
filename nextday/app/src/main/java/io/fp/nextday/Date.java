package io.fp.nextday;

public class Date {
    
    private int day;
    private Month month;
    private int year;

    public Date(int day, Month month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date setNextDay(){

            switch(month){

                case JANUARY:
                    if (day == 31){
                        return new Date(01, Month.FEBRUARY, this.year);
                    }
                    return new Date(day+=1, this.month, this.year);

                case FEBRUARY:
                    if (checkIfLeapYear(this.year) && day == 29){
                        return new Date(01, Month.MARCH, this.year);
                    }
                    else if (!checkIfLeapYear(this.year) && day == 28){
                        return new Date(01, Month.MARCH, this.year);
                    }
                    return new Date(day+=1, this.month, this.year);
                
                case MARCH:
                    if (day == 31){
                        return new Date(01, Month.APRIL, this.year);
                    }
                    return new Date(day += 1, this.month, this.year);
                
                case APRIL:
                    if (day == 30){
                        return new Date(01, Month.MAY, this.year);
                    }
                    return new Date(day += 1, this.month, this.year);
                
                case MAY:
                    if (day == 30){
                        return new Date(01, Month.JUNE, this.year);
                    }
                    return new Date(day += 1, this.month, this.year);
                
                case JUNE:
                    if (day == 30){
                        return new Date(01, Month.JULY, this.year);
                    }
                    return new Date(day += 1, this.month, this.year);
                
                case JULY:
                    if (day == 31){
                        return new Date(01, Month.AUGUST, this.year);
                    }
                    return new Date(day += 1, this.month, this.year);
                
                case AUGUST:
                    if (day == 31){
                        return new Date(01, Month.SEPTEMBER, this.year);
                    }
                    return new Date(day += 1, this.month, this.year);
                
                case SEPTEMBER:
                if (day == 30){
                    return new Date(01, Month.OCTOBER, this.year);
                }
                return new Date(day += 1, this.month, this.year);

                case OCTOBER:
                    if (day == 31){
                        return new Date(01, Month.NOVEMBER, this.year);
                    }
                    return new Date(day += 1, this.month, this.year);
                
                case NOVEMBER:
                    if (day == 30){
                        return new Date(01, Month.DECEMBER, this.year);
                    }
                    return new Date(day += 1, this.month, this.year);
                
                case DECEMBER:
                    if (day == 31){
                        return new Date(01, Month.JANUARY, year += 1);
                    }
                    return new Date(day += 1, this.month, this.year);
            }
            return new Date(this.day, this.month, this.year);
        }
    
    public boolean checkIfLeapYear(int year){
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
    @Override
    public String toString() {
        return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
    }
}
