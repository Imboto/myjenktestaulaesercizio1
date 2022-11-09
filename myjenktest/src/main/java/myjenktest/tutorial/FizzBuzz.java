package myjenktest.tutorial;

public class FizzBuzz {
	public String play(int number) {
        if(number==0)throw new IllegalArgumentException("Numbert must not be 0");
        if(number%3==0)
            return "Fizz";
        if(number%5==0)
            return "Buzz";
        return String.valueOf(number);// 1 - "1"
    }

}
