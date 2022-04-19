/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=i+j;
		    }
		}
		int k=sc.nextInt();
		if(n+1>=k)
		{
		    System.out.println(k-1);
		}
		else{
		    System.out.println(2*n+1-k);
		}
		 
	}
}
