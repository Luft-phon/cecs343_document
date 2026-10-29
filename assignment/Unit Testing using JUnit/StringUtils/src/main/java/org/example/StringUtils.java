package org.example;

public class StringUtils {

    // Converts a string to uppercase
    public String toUpperCase(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null!");
        }
        return input.toUpperCase();
    }

    // Reverses a string
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null!");
        }
        return new StringBuilder(input).reverse().toString();
    }

    // Checks if a string is a palindrome
    public boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null!");
        }
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    // Returns the length of a string
    public int getLength(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null!");
        }
        return input.length();
    }
}
