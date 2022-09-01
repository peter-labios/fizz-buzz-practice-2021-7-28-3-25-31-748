package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int i) {
        if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
            return "FizzBuzzWhizz";
        }
        if (i % 5 == 0 && i % 7 == 0) {
            return "BuzzWhizz";
        }
        if (i % 3 == 0 && i % 7 == 0) {
            return "FizzWhizz";
        }
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        if (i % 7 == 0) {
            return "Whizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(i);
    }
}
