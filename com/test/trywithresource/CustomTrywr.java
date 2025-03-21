package com.test.trywithresource;

public class CustomTrywr implements AutoCloseable
{
    @Override
    public void close() throws Exception
    {
        System.out.println("Resource automatically closed");
    }


}
