package com.stackroute.pe3;

public class Consecutive 
{
	public static boolean checkConsecutive(String s)
	{
	    String[] s1=s.split(",");
	    int x=s1.length;
	    int[] a=new int[x];
	    int i,j=1;
	    for(i=0;i<x;i++)
	    {
	    	a[i]=Integer.parseInt(s1[i]);
	    }
	    for(i=0;i<a.length-1;i++)
	    {
	    if(a[i]==a[i+1]-1)
	    {
	    		j++;
	    }
	    }
	    if(j==a.length)
	    {
	    	return true;
	    }
		return false;
	}
}
