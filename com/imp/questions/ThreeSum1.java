package com.imp.questions;

import java.util.Arrays;

public class ThreeSum1
{
    public static void main(String[] args)
    {
        int arr[] = {2, 7, 4, 0, 9, 5, 1, 3, 3, 2, 4, 3};
        int k = 6;

        Arrays.sort(arr);   // MOST IMPORTANT

        for(int i = 0; i < arr.length; i++)
        {
            if(i != 0 && arr[i] == arr[i-1]) continue;

            int low = i+1;
            int high = arr.length-1;

            while(low < high)
            {
                int sum1 = arr[low] + arr[high] + arr[i];

                if(k == sum1)
                {
                    System.out.println(arr[low] +","+ arr[high] +","+ arr[i]);
                    low++;
                    high--;

                    while(low < high && arr[low-1] == arr[low]) low++;
                    while(low < high && arr[high+1] == arr[high]) high--;
                }
                else if(sum1 < k)
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
}
