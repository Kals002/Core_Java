package com.test.memoryleaks;

import java.util.ArrayList;
import java.util.List;

public class StaticExample
{
   // public  List<Double> list = new ArrayList<>();

    public static List<Double> list = new ArrayList<>();

    public void display()
    {
        for(int i=0; i < 10000000; i++)
        {
            list.add(Math.random());
        }
        System.out.println();
    }


    public static void main(String[] args)
    {
        System.out.println("Before method call");
        new StaticExample().display();
        System.out.println("After method call");
    }
}
