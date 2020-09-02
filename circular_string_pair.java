/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String st2=sc.nextLine();
		st=st+st;
		if(st.contains(st2) && (st2.length()*2)==st.length())
		{
		    System.out.println("Yes");
		}
		else
		{
		    System.out.println("No");
		}
		
	}
}
