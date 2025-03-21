package com.test.trywithresource;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Test1
{
    public static void main(String[] args)
    {
        try(FileInputStream fis = new FileInputStream("");
            FileOutputStream fos = new FileOutputStream(""))
        {
            var read = fis.read();
            fos.write(2);
        }
        catch (Exception e)
        {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
