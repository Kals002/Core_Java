package com.test.classnotfound;

public class Test1
{
    public static void main(String[] args) throws ClassNotFoundException
    {
       // Class.forName("demo");  //ClassNotFoundException

        Class<?> test2Obj = Class.forName("com.test.classnotfound.Test2");
        System.out.println(test2Obj.hashCode());   // 2065951873 - No class not found exception as the class exists.
    }
}
