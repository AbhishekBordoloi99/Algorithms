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
		Map<Integer,Integer> mp= new HashMap<>();
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    A[i]=sc.nextInt();
		}
		for(int x: A)
		{
		    if(mp.containsKey(x))
		    {
		        mp.put(x,mp.get(x)+1);
		    }
		    else
		    {
		        mp.put(x,1);    
		    }
		}
		System.out.println(mp);
	}
}
