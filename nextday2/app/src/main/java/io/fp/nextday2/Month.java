package io.fp.nextday2;

public enum Month {
    JANUARY, 
    FEBRUARY, 
    MARCH, 
    APRIL, 
    MAY, 
    JUNE, 
    JULY, 
    AUGUST, 
    SEPTEMBER, 
    OCTOBER, 
    NOVEMBER, 
    DECEMBER;

    public Month getNexMonth(){
        return values()[(ordinal() +1) % values().length];
    }
}
