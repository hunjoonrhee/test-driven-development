import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void fizzBuzzTestfor3(){
        // GIVEN
        int number = 3;

        // WHEN
        String actual = FizzBuzz.fizzBuzz(number);

        // THEN
        assertEquals("fizz", actual);
    }
    @Test
    void fizzBuzzTestfor5(){
        // GIVEN
        int number = 5;

        // WHEN
        String actual = FizzBuzz.fizzBuzz(number);

        // THEN
        assertEquals("buzz", actual);
    }
    @Test
    void fizzBuzzTestfor3und5(){
        // GIVEN
        int number = 15;

        // WHEN
        String actual = FizzBuzz.fizzBuzz(number);

        // THEN
        assertEquals("fizzbuzz", actual);
    }
    @Test
    void fizzBuzzTestforOthers(){
        // GIVEN
        int number = 4;

        // WHEN
        String actual = FizzBuzz.fizzBuzz(number);

        // THEN
        assertEquals("4", actual);
    }
}
