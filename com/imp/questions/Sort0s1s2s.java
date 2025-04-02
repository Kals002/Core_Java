package com.imp.questions;

import java.util.Arrays;

public class Sort0s1s2s
{
    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 1, 0, 1, 2, 0, 1, 2, 1, 0};

        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid < high)
        {
            if(arr[mid] == 1)
            {
                mid++;
            }
            else if(arr[mid] == 2)
            {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
            else if(arr[mid] == 0)
            {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
