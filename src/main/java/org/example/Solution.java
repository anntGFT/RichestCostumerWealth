package org.example;

import java.util.Arrays;

public class Solution {

    public Solution(){

    }

    public int maximumWealth(int[][] accounts) {

        int result;

        result = Arrays.stream(accounts)
                .mapToInt(row -> Arrays.stream(row).sum())
                .max().orElse(0);

        return result;
    }
}