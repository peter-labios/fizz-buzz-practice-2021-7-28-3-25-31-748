package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
     void should_return_1_when_countOff_given_1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "1";
        String actual = fizzBuzz.countOff(1);
        assertEquals(expected, actual);
    }
}
