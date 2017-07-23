package test;
import org.testng.annotations.Test;

import main.LeapYear;

/**
 * Created by PANYE on 7/20/2017.
 */
public class LeapYearTest {

    @Test
    public  void should_return_true_givenyear_divisible_by_400(){
    //Given
    int year = 2000;
    //When
    boolean result = LeapYear.leapyear(year);
    //Then
    assert(result == true);
    }

    @Test
    public  void should_return_true_givenyear_divisible_by_4(){
        //Given
        int year = 1996;

        //When
        boolean result = LeapYear.leapyear(year);
        //Then
        assert(result == true);
    }

    @Test
    public  void should_return_false_givenyear_divisible_by_100(){
        //Given
        int year = 1900;

        //When
        boolean result = LeapYear.leapyear(year);
        //Then
        assert(result == false);
    }

    @Test
    public  void should_return_false_givenyear_not_divisible_by_4(){
        //Given
        int year = 1997;

        //When
        boolean result = LeapYear.leapyear(year);
        //Then
        assert(result == false);
    }
}
