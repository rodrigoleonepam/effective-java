package com.epam.task;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class RecursiveSearchTest {

    private static RecursiveSearch recursiveSearch;

    @BeforeAll
    @DisplayName("Preparing test")
    public static void preparingTest() {
        List<Integer> numers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        recursiveSearch = new RecursiveSearch(numers);
    }

    @Test
    @DisplayName("Number is found")
    public void testNumberFound() {
        assertTrue(recursiveSearch.searchBinary(4));
    }

    @Test
    @DisplayName("Number is not found")
    public void testNumberNotFound() {
        assertFalse(recursiveSearch.searchBinary(11));
    }
  
}
