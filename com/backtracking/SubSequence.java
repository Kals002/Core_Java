package com.backtracking;

import java.util.*;

public class SubSequence
{
    public static void main(String[] args)
    {
        int[] arr = {3, 1, 2};

        HashSet<List<Integer>> result = new HashSet<>();

        subsequence(0, arr, new ArrayList<Integer>(), result);

        System.out.println(result);
    }

    private static void subsequence(int index, int[] arr, ArrayList<Integer> list, HashSet<List<Integer>> result)
    {
        if(index == arr.length)
        {
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[index]);
        subsequence(index+1, arr, list, result);
        list.removeLast();

        subsequence(index+1, arr, list, result);
    }
}
