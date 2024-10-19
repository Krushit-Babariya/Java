package com.thealgorithms.misc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

public class FourSumProblemTest {

    @Test
    void testFourSumExists() {
        FourSumProblem fourSumProblem = new FourSumProblem();
        final int[] values = {1, 0, -1, 0, -2, 2};
        final int target = 0;

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(-2, -1, 1, 2));
        expected.add(List.of(-2, 0, 0, 2));
        expected.add(List.of(-1, 0, 0, 1));

        assertEquals(expected, fourSumProblem.fourSum(values, target));
    }

    @Test
    void testFourSumNoSolution() {
        FourSumProblem fourSumProblem = new FourSumProblem();
        final int[] values = {2, 7, 11, 15};
        final int target = 3;

        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, fourSumProblem.fourSum(values, target)); 
    }

    @Test
    void testFourSumWithMultipleSolutions() {
        FourSumProblem fourSumProblem = new FourSumProblem();
        final int[] values = {-3, -1, 0, 2, 4, 5};
        final int target = 2;

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(-3, -1, 2, 4));

        assertEquals(expected, fourSumProblem.fourSum(values, target));
    }

    @Test
    void testFourSumAllSameNumbers() {
        FourSumProblem fourSumProblem = new FourSumProblem();
        final int[] values = {2, 2, 2, 2, 2};
        final int target = 8;

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(2, 2, 2, 2));

        assertEquals(expected, fourSumProblem.fourSum(values, target));
    }

    @Test
    void testFourSumWithNegativeNumbers() {
        FourSumProblem fourSumProblem = new FourSumProblem();
        final int[] values = {-1, 0, 1, 2, -1, -4};
        final int target = -1;

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(-4, 0, 1, 2));
        expected.add(List.of(-1, -1, 0, 1));

        assertEquals(expected, fourSumProblem.fourSum(values, target));
    }

    @Test
    void testFourSumEmptyInput() {
        FourSumProblem fourSumProblem = new FourSumProblem();
        final int[] values = {};
        final int target = 0;

        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, fourSumProblem.fourSum(values, target));
    }

    @Test
    void testFourSumLessThanFourElements() {
        FourSumProblem fourSumProblem = new FourSumProblem();
        final int[] values = {1, 2, 3};
        final int target = 6;

        List<List<Integer>> expected
