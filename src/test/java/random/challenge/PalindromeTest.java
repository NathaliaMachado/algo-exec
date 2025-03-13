package random.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PalindromeTest {

    @Test
    void isPalindrome_Palindrome_true() {
        final var str = "1A 0man, a plan, a canal, 9Panama!1";
        final var result = Palindrome.isPalindrome(str);
        assertTrue(result);
    }

    @Test
    void isPalindrome_NotPalindrome_false() {
        final var str = "Appel!";
        final var result = Palindrome.isPalindrome(str);
        assertFalse(result);
    }

    @Test
    void simplifyString() {
        final var str = "Red rum, sir, is murder!";
        final var simplified = Palindrome.simplifyString(str);
        assertEquals("redrumsirismurder", simplified);
    }
}