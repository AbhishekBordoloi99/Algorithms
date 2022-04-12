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
		int n=4;
		int k=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=sc.nextInt();
		    }
		}
		int j=0;
		while(j<n)
		{
		    for(int i=k;i<n;i++)
		    {
		        System.out.print(a[j][i]+" ");
		    }
		    for(int i=0;i<k;i++)
		    {
		        System.out.print(a[j][i]+" ");
		    }
		    j++;
		    System.out.println();
		}
	}
}
