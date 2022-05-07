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
		int A[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        A[i][j]=sc.nextInt();
		    }
		}
		
		for(int i=0;i<n;i++)
		{
		    int r=0,c=i;
		    for(int j=0;j<=i;j++)
		    {
		        System.out.print(A[c][r]+" ");
		        r++;
		        c--;
		    }
		}
		for(int i=1;i<n;i++)
		{
		    int r=n-1,c=i;
		    for(int j=i;j<n;j++)
		    {
		        System.out.print(A[r][c]+" ");
		        r--;
		        c++;
		    }
		}
	}
}
