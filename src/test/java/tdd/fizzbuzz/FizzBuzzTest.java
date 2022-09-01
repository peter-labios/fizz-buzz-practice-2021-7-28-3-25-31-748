package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
     void should_return_1_when_countOff_given_1(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "1";
        int input = 1;
        //when
        String actual = fizzBuzz.countOff(input);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_fizz_when_countOff_given_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";
        int input = 3;
        //when
        String actual = fizzBuzz.countOff(input);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_buzz_when_countOff_given_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";
        int input = 5;
        //when
        String actual = fizzBuzz.countOff(input);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_whizz_when_countOff_given_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Whizz";
        int input = 7;
        //when
        String actual = fizzBuzz.countOff(input);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_fizzbuzz_when_countOff_given_multiple_of_3_and_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz Buzz";
        int input = 15;
        //when
        String actual = fizzBuzz.countOff(input);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_fizzwhizz_when_countOff_given_multiple_of_3_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz Whizz";
        int input = 21;
        //when
        String actual = fizzBuzz.countOff(input);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_buzzwhizz_when_countOff_given_multiple_of_5_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz Whizz";
        int input=35;
        //when
        String actual = fizzBuzz.countOff(input);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_fizzbuzzwhizz_when_countOff_given_multiple_of_3_5_and_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz Buzz Whizz";
        int input = 105;
        //when
        String actual = fizzBuzz.countOff(input);
        //then
        assertEquals(expected, actual);
    }
}
