package org.wedenig.palindromechecker;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Simple unit tests
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testPalindromPositive() throws Exception {
        assertEquals(true, Utility.isPalindrome("aibohphobia"));
    }

    @Test
    public void testPalindromNegative() throws Exception {
        assertEquals(false, Utility.isPalindrome("asdfasdf"));
    }
}