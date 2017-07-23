package main;

/**
 * Created by PANYE on 7/20/2017.
 */
public class FizzBuzz {
	public static String fizzBuzz(int number) {
		if(number%3==0&&number%5!=0)
			return "Fizz";
		else if(number%3!=0&&number%5==0)
			return "Buzz";
		else if(number%3==0&number%5==0)
			return "FizzBuzz";
		else return String.valueOf(number);
	}
}
