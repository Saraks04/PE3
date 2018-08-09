package com.stackroute.pe3;

public class Excp 
{
	    
	    public static  String testoutofbound(int access,int a[])
	        {    
	    	try {
				int arr[]= new int[access];
				arr[4]=23;
			}
			catch(IndexOutOfBoundsException e) {
				return "4";
				}
	    	return "null";
	        }
	    public static String testNegativeArray(int size)
	    {
	    	try
	    	{
	    		int[] n=new int[size];
	    		
	    	}
	    	catch(NegativeArraySizeException e) 
	    	{
	    		return "null";
			}
	    	return "null";
	    }
	    public static String testNullPointer(String a)
	    {
	    	try {
	    		String g=a;
	    		}
	    		catch(NullPointerException e) 
	    		{
	    			
	    			e.printStackTrace();
	    			return e.toString();
	    		}
	    	return "null";
	    }
}
