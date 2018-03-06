package org.wedenig.palindromechecker;

/**
 * Created by wedenigc on 06.03.18.
 */

public class Utility {
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
