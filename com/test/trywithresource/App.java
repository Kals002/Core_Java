package com.test.trywithresource;

public class App
{
    public static void main(String[] args)
    {
        try(CustomTrywr cObj = new CustomTrywr())
        {
            System.out.println(cObj.hashCode());
        }
        catch(Exception e)
        {
            System.out.println("Some exception occurred");
        }


    }
}
