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
		        a[i][j]=sc.nextInt();
		    }
		}
		int min=a[0][0], max=a[0][0];
		
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(a[i][j]<=min)
		        {
		            min=a[i][j];
		        }
		        else if(a[i][j]>=max)
		        {
		            max=a[i][j];
		        }
		    }
		}
		
		System.out.println("Minimum: "+min);
		System.out.println("Maximum: "+max);
	}
}
