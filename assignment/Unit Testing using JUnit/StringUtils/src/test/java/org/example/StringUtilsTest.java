package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    private final StringUtils utils = new StringUtils();

    @Test
    void toUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
    }

    @Test
    void toUpperCaseNull() {
        assertThrows(IllegalArgumentException.class, () -> utils.toUpperCase(null));
    }

    @Test
    void reverse() {
        assertEquals("olleh", utils.reverse("hello"));
    }
    @Test
    void reverseNull(){
        assertThrows(IllegalArgumentException.class, () -> utils.reverse(null));
    }

    @Test
    void isPalindromeTrue() {
        assertTrue(utils.isPalindrome("madam"));
    }

    @Test
    void isPalindromeFalse(){
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void isPalindromeNull() {
        assertThrows(IllegalArgumentException.class, () -> utils.isPalindrome(null));
    }

    @Test
    void getLength() {
        assertEquals(5, utils.getLength("hello"));
    }

    @Test
    void getLengthNull() {
        assertThrows(IllegalArgumentException.class, () -> utils.getLength(null));
    }
}