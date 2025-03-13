package random.challenge;

/*
Write a Java method that checks if a given word or sentence is a palindrome. The method should:

Remove all characters that are not letters (e.g., spaces, numbers, punctuation).
Ignore case differences.
Return true if the cleaned string is a palindrome and false otherwise.

Ex:
isPalindrome("A man, a plan, a canal, Panama!"); // true
isPalindrome("Hello, World!"); // false
isPalindrome("Was it a car or a cat I saw?"); // true
 */

public class Palindrome {

    public static boolean isPalindrome(final String str) {

        String simplified = simplifyString(str);
        String reversed =  new StringBuilder(simplified).reverse().toString();
        return reversed.equals(simplified);
    }

    public static String simplifyString(final String str) {
        return str.toLowerCase().replaceAll("[^a-z]", "");
    }
}
