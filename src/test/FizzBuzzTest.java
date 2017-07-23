package test;

import org.testng.annotations.Test;

import main.FizzBuzz;

/**
 * Created by PANYE on 7/20/2017.
 */
public class FizzBuzzTest {
    @Test

    public void should_return_Fizz_given_number_is_divisible_by_3(){
        //Given
        int number = 3;

        //When
        String result = FizzBuzz.fizzBuzz(number);
        //Then
        assert(result.equals("Fizz"));
    }

    @Test
    public void should_return_Buzz_given_number_is_divisible_by_5(){
        //Given
        int number = 5;

        //when

        String result = FizzBuzz.fizzBuzz(number);
        //Then

        assert(result.equals("Buzz"));
    }

    @Test
    public void should_return_FizzBuzz_given_number_is_divisible_by_15(){
        //Given
        int number = 15;

        //When
        String result = FizzBuzz.fizzBuzz(number);
        //Then
        assert(result.equals("FizzBuzz"));
    }

    @Test
    public void should_return_given_number_not_divisible(){
        //Given
        int number = 4;
        String result = FizzBuzz.fizzBuzz(number);
        //Then
        assert(result.equals("4"));
    }


}
