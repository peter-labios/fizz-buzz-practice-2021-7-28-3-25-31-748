package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int i) {
        if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
            return "Fizz Buzz Whizz";
        }
        if (i % 5 == 0 && i % 7 == 0) {
            return "Buzz Whizz";
        }
        if (i % 3 == 0 && i % 7 == 0) {
            return "Fizz Whizz";
        }
        if (i % 3 == 0 && i % 5 == 0) {
            return "Fizz Buzz";
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
