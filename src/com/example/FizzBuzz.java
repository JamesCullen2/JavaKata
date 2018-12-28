package com.example;


public class FizzBuzz {

    public static void main(String[] args) {
    }

    public String replaceNumbersWithFizzBuzz(int number) {

        if (number%3==0) {
            return "Fizz";
        }

        if (number%5==0) {
            return "Buzz";
        }

        if (number%15==0) {
            return "FizzBuzz";
        }

        return String.valueOf(number);
    }
}

