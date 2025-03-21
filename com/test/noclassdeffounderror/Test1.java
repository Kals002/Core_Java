package com.test.noclassdeffounderror;



public class Test1
{
    private Test2 test2 = new Test2();

    public static void main(String[] args)
    {
        Test1 t1Obj = new Test1();

        System.out.println(t1Obj.test2.hashCode());  //Class found during compilation but was .class file removed later

        //After removing .class file of Test2 class we get NoClassDefFoundError. .class file will be present in
        // out directory.
    }
}
