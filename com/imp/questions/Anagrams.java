package com.imp.questions;

public class Anagrams
{
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silet";

        int[] arr = new int[26];

        for(int i = 0; i < str1.length(); i++)
        {
            arr[str1.charAt(i) - 'a']++;
        }

        for(int j = 0; j < str2.length(); j++)
        {
            arr[str2.charAt(j) - 'a']--;
        }

        boolean flag = false;

        for(int i : arr)
        {
            if( i != 0)
            {
                flag = false;
                break;
            }
            else
            {
                flag = true;
            }
        }

        System.out.println(flag);

    }
}
