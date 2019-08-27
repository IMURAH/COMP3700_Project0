/**
 * Le Cai lzc003
 * COMP 3700
 * JUnit Test Class for Finder class
 * There are 6 tests in total 3 test function for each method in Finder class.
 */

import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class JUnitTest {
    @Test
    public void test_findMax()  {
        Finder find1 = new Finder();
        int[] validArr = {10, 2, 5, 8, 12, 15, 7};
        int expectedResult = 15;
        int actualResult = find1.findMax(validArr);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_findEmptyMax()  {
        Finder find1 = new Finder();
        int[] invalidArr = {};
        Integer actualResult = find1.findMax(invalidArr);

        Assert.assertNull(actualResult);
    }
    
    @Test
    public void test_findNullMax()  {
        Finder find1 = new Finder();
        Integer actualResult = find1.findMax(null);
        
        Assert.assertNull(actualResult);
    }

    @Test
    public void test_findMin()  {
        Finder find1 = new Finder();
        int[] validArr = {10, 2, 5, 8, 12, 15, 7};
        int expectedResult = 2;
        int actualResult = find1.findMin(validArr);

        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_findEmptyMin()  {
        Finder find1 = new Finder();
        int[] invalidArr = {};
        Integer actualResult = find1.findMin(invalidArr);

        assertNull(actualResult);
    }

    @Test
    public void test_findNullMin()  {
        Finder find1 = new Finder();
        Integer actualResult = find1.findMin(null);

        Assert.assertNull(actualResult);
    }
}
