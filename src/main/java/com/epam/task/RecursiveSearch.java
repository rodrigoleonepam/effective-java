package com.epam.task;

import java.util.Arrays;
import java.util.List;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class RecursiveSearch {

    private List<Integer> numbers;

    public RecursiveSearch(List<Integer> numbers) {
        log.info("Instantiating RecursiveBinarySearch");
        this.numbers = numbers;
    }

    public boolean searchBinary(int key) {
        log.info("Searching number: " + key);
        return searchBinary(0, numbers.size() - 1, key);
    }

    private boolean searchBinary(int low, int high, int key) {
        if (low > high) {
            return false;
        }
        int mid = low + (high - low) / 2;
        if (numbers.get(mid) == key) {
            return true;
        } else if (numbers.get(mid) > key) {
            return searchBinary(low, mid - 1, key);
        } else {
            return searchBinary(mid + 1, high, key);
        }
    }

    public static void main(String args[]) {
        log.info("Starting RecursiveSearch");
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        RecursiveSearch recursiveBinarySearch = new RecursiveSearch(list);
        boolean found = recursiveBinarySearch.searchBinary(5);
        log.info("Number found: " + found);
    }
}
