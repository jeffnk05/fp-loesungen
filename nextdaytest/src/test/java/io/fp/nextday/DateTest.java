package io.fp.nextday;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class DateTest {

    Date date;

    @BeforeEach
    void setUp() throws DateException {

        date = new Date(31, Month.DECEMBER, 2020);
        
    }

    @Test
    void testNextDay() {
       
        date = date.getNextDay();

        assertTrue(date.getDay()== 1 && date.getMonth() == Month.JANUARY && date.getYear() == 2021);
        
    }

    @Test
    void testGetNextDaycasual() throws DateException{
        Date casualDate = new Date(05, Month.OCTOBER, 2001);
        Date date = casualDate.getNextDay();

        assertEquals(casualDate.getDay() + 1, date.getDay());
        assertEquals(Month.OCTOBER, date.getMonth());
        assertEquals(2001, date.getYear());
    } 
    
    @Test
    void testGetNextDayYearOverflow() throws DateException {
        Date lastDayOfYear = new Date(31, Month.DECEMBER, 2021);
        Date firstDayOfYear = new Date(01, Month.JANUARY, 2022);
        Date actualDate = lastDayOfYear.getNextDay();

        assertEquals(firstDayOfYear.getDay(), actualDate.getDay());
        assertEquals(firstDayOfYear.getMonth(), actualDate.getMonth());
        assertEquals(firstDayOfYear.getYear(), actualDate.getYear());
    }

   @Test
   void testCreateIncorrectDateNegativeDay(){

       assertThrows(DateException.class, ()->{new Date(-5, Month.MARCH, 2023);});
   }

   @Test
   void testCreateIncorrektDateNegativeYear(){
    assertThrows(DateException.class, ()->{new Date(5, Month.MARCH, -2023);});
   }

   @Test
   void testCreateIncorrectDateNonLeapYear(){
       assertThrows(DateException.class, ()->{new Date(29, Month.FEBRUARY, 2021);});
   }

   @Test
   void testGetNextDayShortMonthOverflow() throws DateException{
       Date endMonthdDate = new Date(30, Month.APRIL, 2021);
       Date nextDate = endMonthdDate.getNextDay();
       Date beginningMonthdDate = new Date(1, Month.MAY, 2021);
    
       assertEquals(beginningMonthdDate.getDay(), nextDate.getDay());
       assertEquals(beginningMonthdDate.getMonth(), nextDate.getMonth());
       assertEquals(beginningMonthdDate.getYear(), nextDate.getYear());
   }

   @Test
   void testGetNextDayLeapYearFebruary() throws DateException{
       Date date = new Date(28, Month.FEBRUARY, 2020);
       Date nextDate = date.getNextDay();
       Date expectedDate = new Date(29, Month.FEBRUARY, 2020);
    
       assertEquals(expectedDate.getDay(), nextDate.getDay());
       assertEquals(expectedDate.getMonth(), nextDate.getMonth());
       assertEquals(expectedDate.getYear(), nextDate.getYear());
   }

   @Test
   void testGetNextDayLongMonthOverflow() throws DateException{
       Date casualDate = new Date(31, Month.OCTOBER, 2012);
       Date nextDate = casualDate.getNextDay();
       Date testDate = new Date(1, Month.NOVEMBER, 2012);

       assertEquals(testDate.getDay(), nextDate.getDay());
       assertEquals(testDate.getMonth(), nextDate.getMonth());
       assertEquals(testDate.getYear(), nextDate.getYear());
   }

   @Test
   void testGetNextDayNoLeapYearFebruary() throws DateException{
       Date casualDate = new Date(28, Month.FEBRUARY, 2021);
       Date nextDate = casualDate.getNextDay();
       Date beginningMonthdDate = new Date(01, Month.MARCH, 2021);

       assertEquals(beginningMonthdDate.getDay(), nextDate.getDay());
       assertEquals(beginningMonthdDate.getMonth(), nextDate.getMonth());
       assertEquals(beginningMonthdDate.getYear(), nextDate.getYear());
   }
}