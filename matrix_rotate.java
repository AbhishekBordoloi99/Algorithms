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
		int A[][]=new int[n][n];
		
		//Input Matrix ELements
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        A[i][j]=sc.nextInt();
		    }
		}
		//Print Original Array
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(A[i][j]+" ");
		    }
		    System.out.println();
		}
		
		//Transpose Matrix
		System.out.println();
		for(int i=0;i<n;i++)
		{
		    for(int j=i;j<n;j++)
		    {
		        int tmp=A[i][j];
		        A[i][j]=A[j][i];
		        A[j][i]=tmp;
		    }
		}
		
		System.out.println("Transposed");
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(A[i][j]+" ");
		    }
		    System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n/2;j++)
		    {
		        int tmp=A[i][j];
		        A[i][j]=A[i][n-j-1];
		        A[i][n-j-1]=tmp;
		    }
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(A[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
