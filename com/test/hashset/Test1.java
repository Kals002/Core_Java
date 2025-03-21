package com.test.hashset;

import java.util.HashMap;

public class Test1
{
    private HashMap<String, String> hashMap = new HashMap<>();

    public boolean add(String str)
    {
        return ( hashMap.put(str, "PRESENT") == null );
    }

    public String get(String key)
    {
        return hashMap.get(key);
    }

    public static void main(String[] args)
    {
        Test1 tObj = new Test1();

        tObj.add("john");
        tObj.add("john");
        tObj.add("john");
        tObj.add("david");

        System.out.println(tObj.hashMap.keySet().size());
        System.out.println(tObj.hashMap.get("david"));
    }
}
