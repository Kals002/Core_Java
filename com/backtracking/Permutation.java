package com.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutation
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3};

        HashSet<List<Integer>> result = new HashSet<>();

        perm(0, arr, result);

        System.out.println(result);

    }

    private static void perm(int index, int[] arr, HashSet<List<Integer>> result)
    {
        if(index == arr.length)
        {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j : arr)
            {
                list.add(j);
            }
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < arr.length; i++)
        {
            swap(index, i, arr);
            perm(index+1, arr, result);
            swap(index, i, arr);
        }
    }

    private static void swap(int index, int i, int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}
