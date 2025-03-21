package com.test.memoryleaks;

import java.util.ArrayList;

public class Test1
{
    public static void main(String[] args)
    {
        //Using initial size for the collections datastructures

        ArrayList<Double> list = new ArrayList<>();

        long first1 = System.currentTimeMillis();

        for(int i = 0 ; i < 10000000; i++ )
        {
            list.add(Math.random());
        }

        long second1 = System.currentTimeMillis();

        System.out.println(second1-first1);

        System.out.println("------------------");


        ArrayList<Double> list2 = new ArrayList<>(10000000);

        long first2 = System.currentTimeMillis();

        for(int i = 0 ; i < 10000000; i++ )
        {
            list2.add(Math.random());
        }

        long second2 = System.currentTimeMillis();

        System.out.println(second2-first2);
    }
}
