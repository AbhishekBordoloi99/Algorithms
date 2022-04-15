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
		int sum_r=0,sum_c=0;
		for(int i=0;i<n;i++)
		{
		    sum_r+=a[n/2][i];
		    sum_c+=a[i][n/2];
		}
		
		System.out.println("Row Sum:    "+sum_r);
		System.out.println("Column Sum: "+sum_c);
	}
}
