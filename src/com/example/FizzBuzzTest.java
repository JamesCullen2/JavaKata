package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    public void shouldPrintFizzGivenMultipleOfThree() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // When
        String multipleOfThree = fizzBuzz.replaceNumbersWithFizzBuzz(3);

        // Then
        Assertions.assertEquals("Fizz", multipleOfThree);
    }
}