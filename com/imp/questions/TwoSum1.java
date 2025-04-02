package com.imp.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TwoSum1
{
    public static void main(String[] args)
    {
        int []arr = {2, 4, 1, 7, 8, 10, 9, 0, 5, 6, 0, 6, 2, 4};
        int sum = 6;

        HashSet<List<Integer>> result = new HashSet<>();

        //Using HashMap

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j : arr)
        {
            int diff = sum - j;

            if (map.containsKey(diff))
            {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(j);
                list.add(diff);
                list.sort(null);
                result.add(list);
            }
            else
            {
                map.put(j, j);
            }
        }

        result.forEach(System.out :: println);

    }

}
