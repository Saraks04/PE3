package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class ExcpTest {
private static Excp obj;
@BeforeClass
public static void setup() {
    obj = new Excp();
}
@AfterClass
public static void teardown() {
    obj = null;
}
    @Test
    public void test() {
        //fail("Not yet implemented");
        int access=4;
        int arr[]= {10,20,30,40};
        String s=obj.testoutofbound(access,arr);
        assertEquals("4",s);
        }
    @Test
    public void test1()
    {
        int size=-6;
        String s=obj.testNegativeArray(size);
        assertEquals("null",s);
    }
    @Test
    public void test2()
    {
        String arr=null;
        String s=obj.testNullPointer(arr);
        assertEquals("null",s);
    }
}

