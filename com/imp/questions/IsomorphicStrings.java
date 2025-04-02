package com.imp.questions;

import java.util.HashMap;

public class IsomorphicStrings
{
    public static void main(String[] args) {

        String s1 = "adad";
        String s2 = "nqno";

        HashMap<Character, Character> map = new HashMap<>();
        boolean flag = false;

        for(int i = 0; i < s1.length(); i++)
        {
            if(map.containsKey(s1.charAt(i)))
            {
                if(map.get(s1.charAt(i)) != s2.charAt(i))
                {
                    flag = false;
                }
                else
                {
                    flag = true;
                }
            }
            else
            {
                map.put(s1.charAt(i), s2.charAt(i));
            }
        }
        System.out.println(flag);

    }
}
