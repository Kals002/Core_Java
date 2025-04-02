package com.backtracking;

import java.util.ArrayList;

public class SubSum
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 4, 3, 11, 5, 6, 7};
        int sum = 7;


        subsum(0, arr, new ArrayList<Integer>(), sum);

    }

    private static void subsum(int index, int[] arr, ArrayList<Integer> list, int sum)
    {
        if(index == arr.length)
        {
            if(sum == list.stream().mapToInt(e -> e).sum())
            {
                System.out.println(list);
                return;
            }
            return;
        }
        list.add(arr[index]);
        subsum(index+1, arr, list, sum);

        list.removeLast();
        subsum(index+1, arr, list, sum);
    }
}
