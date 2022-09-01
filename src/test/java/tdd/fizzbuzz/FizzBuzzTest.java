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

    @Test
    void should_return_fizz_when_countOff_given_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";
        String actual = fizzBuzz.countOff(3);
        //when
        assertEquals(expected, actual);
        //then
    }

    @Test
    void should_return_buzz_when_countOff_given_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";
        String actual = fizzBuzz.countOff(5);
        //when
        assertEquals(expected, actual);
        //then
    }

    @Test
    void should_return_whizz_when_countOff_given_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Whizz";
        String actual = fizzBuzz.countOff(7);
        //when
        assertEquals(expected, actual);
        //then
    }

    @Test
    void should_return_fizzbuzz_when_countOff_given_multiple_of_3_and_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz Buzz";
        String actual = fizzBuzz.countOff(15);
        //when
        assertEquals(expected, actual);
        //then
    }

    @Test
    void should_return_fizzwhizz_when_countOff_given_multiple_of_3_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz Whizz";
        String actual = fizzBuzz.countOff(21);
        //when
        assertEquals(expected, actual);
        //then
    }

    @Test
    void should_return_buzzwhizz_when_countOff_given_multiple_of_5_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz Whizz";
        String actual = fizzBuzz.countOff(35);
        //when
        assertEquals(expected, actual);
        //then
    }
}
