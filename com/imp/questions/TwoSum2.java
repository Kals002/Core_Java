package com.imp.questions;

import java.util.Arrays;

public class TwoSum2
{
    public static void main(String[] args)
    {
        int []arr = {2, 4, 1, 7, 8, 10, 9, 0, 5, 6, 0, 6, 2, 4};
        int sum = 6;

        //using sorting

        Arrays.sort(arr);

        int low = 0;
        int high = arr.length-1;

        while(low < high)
        {
            int sum1 = arr[low] + arr[high];

            if(sum  == sum1)
            {
                System.out.println(arr[low]+","+arr[high]);

                low++;
                high--;

                while(low < high && arr[low-1] == arr[low]) low++;
                while(low < high && arr[high+1] == arr[high]) high--;
            }
            else if(sum1 < sum)
            {
                low++;
            }
            else
            {
              high--;
            }
        }

    }
}
