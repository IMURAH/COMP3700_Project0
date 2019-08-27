/**
 * Le Cai lzc0033
 * COMP 3700 Assignment 2
 * Finder class
 * return Min and Max value of a integer array, return null if the array is empty or null.
 */

public class Finder {
    public Finder() {
        System.out.println("Welcome to Finder class...");
    }
    public Integer findMax(int[] intArray)  {
        int max = 0;
        if (intArray == null)   {
            System.out.println("Array is null.");
            return null;
        }
        else if (intArray.length == 0)  {
            System.out.println("Array is empty.");
            return null;
        }
        else    {
            max = intArray[0];
            for (int i = 1; i < intArray.length; i++) {
                if (intArray[i] > max)  {
                    max = intArray[i];
            }
        }
            return max;
        }
    }

    public Integer findMin(int[] intArray)  {
        int min = 0;
        if (intArray == null)  {
            System.out.println("Array is null.");
            return null;
        }
        else if (intArray.length == 0)  {
            System.out.println("Array is empty");
            return null;
        }
        else    {
            min = intArray[0];
            for (int i = 1; i < intArray.length; i++)   {
                if (intArray[i] < min)  {
                    min = intArray[i];
            }
        }
            return min;
        }
    }

}
