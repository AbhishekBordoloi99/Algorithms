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
		int n=3;
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=sc.nextInt();
		    }
		}
		
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n/2;j++)
		    {
		        int tmp=a[i][j];
		        a[i][j]=a[i][n-j-1];
		        a[i][n-j-1]=tmp;
		    }
		}
		
		for(int i=0;i<n/2;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        int tmp=a[i][j];
		        a[i][j]=a[n-i-1][j];
		        a[n-i-1][j]=tmp;
		    }
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
		
		
}}
