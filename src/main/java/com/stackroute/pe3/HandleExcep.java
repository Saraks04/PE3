package com.stackroute.pe3;

public class HandleExcep 
{
		String s;
		HandleExcep(String ar)
		{
			this.s=ar;
		}
		public static void throwExcep(String s)
		{
			try
			{
				Exception e=new Exception();
				throw e;
			}
			catch(Exception e)
			{
				System.out.println(s);
			}
			finally
			{
				System.out.println("You are here");
			}
		}
		public static void main(String args[])
		{
			String msg="Exception thrown here";
			throwExcep(msg);
		}
}

