package com.backtracking;

import java.util.ArrayList;

public class SubSumCount
{
    public static void main(String[] args)
    {

        int[] arr = {1, 2, 4, 3, 11, 5, 6, 7};
        int sum = 7;

        System.out.println(subsumcount(0, arr, new ArrayList<Integer>(), sum));
    }

    private static int subsumcount(int index, int[] arr, ArrayList<Integer> list, int sum)
    {
        if(index == arr.length)
        {
            if(sum == list.stream().mapToInt(e -> e).sum())
            {
                return 1;
            }
            return 0;
        }

        list.add(arr[index]);
        int first = subsumcount(index+1, arr, list, sum);

        list.removeLast();
        int second = subsumcount(index+1, arr, list, sum);

        return (first+second);
    }
}
