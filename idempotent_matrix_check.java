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
		int b[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=sc.nextInt();
		    }
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        for(int k=0;k<n;k++)
		        {
		            sum+=a[i][k]*a[k][j];
		        }
		        b[i][j]=sum;
		        sum=0;
		    }
		}
		int flag=0;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(a[i][j]!=b[i][j])
		        {
		            flag=1;
		            break;
		        }
		    }
		    
		}
		
		if(flag==0)
		{
		    System.out.println("Idempotent");
		}
		else{
		    System.out.println("Not Idempotent");
		}
	}
}
