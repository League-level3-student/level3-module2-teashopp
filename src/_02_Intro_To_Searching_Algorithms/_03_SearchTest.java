package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method    	
    	
    	String[] words0 = {"abc" , "bac" , "cab"};
    	String value0 = "bac";
        assertEquals(1, _01_LinearSearch.linearSearch(words0, value0));
        
        String[] words1 = {"abc" , "bac" , "cab"};
        String value1 = "def";
        assertEquals(-1, _01_LinearSearch.linearSearch(words1, value1));
        
        String[] words2 = {};
        String value2 = "cab";
        assertEquals(-1, _01_LinearSearch.linearSearch(words2, value2));
        
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	
    	int[] array0 = { 0 , 1 , 2 , 3 , 4};
    	int start0 = 0;
    	int end0 = 4;
    	int value0 = 2;
        assertEquals(2, _02_BinarySearch.binarySearch(array0, start0, end0, value0));
        
        int[] array1 = { 0 , 1 , 2 , 3 , 4 };
        int start1 = 0;
        int end1 = 4;
        int value1 = 0;
        assertEquals(_02_BinarySearch.binarySearch(array1, start1, end1, value1), _02_BinarySearch.binarySearch(array1, start1, end1, value1));
        
        
    
    }
}
