package com.test.marker;

public class App
{
    public static void main(String[] args)
    {
        Test1 t1Obj = new Test1();

        System.out.println(check(t1Obj));

        Test2 t2Obj = new Test2();

        System.out.println(check(t2Obj));
    }

    public static boolean check(Object obj)
    {
        return ( obj instanceof CustomeMarkerInterface);
    }


}
