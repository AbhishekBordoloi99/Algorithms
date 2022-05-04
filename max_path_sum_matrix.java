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
		int point_max=0,max=A[0][0];
		for(int i=1;i<n;i++)
		{
		    if(A[0][i]>=max)
		    {
		        point_max=i;max=A[0][i];
		    }
		    //System.out.println(max);
		}
		//System.out.println(max);
		int sum=max;
		for(int i=1;i<n;i++)
		{
		    //All directions possible
		    if(point_max>=0 && point_max!=(n-1))
		    {
		        if(A[i][point_max-1]>A[i][point_max] && A[i][point_max-1]>A[i][point_max+1])
    		    {
    		        sum+=A[i][point_max-1];
    		        point_max=point_max-1;
    		    }
    		    else if(A[i][point_max+1]>A[i][point_max-1] && A[i][point_max+1]>A[i][point_max] )
    		    {
    		        sum+=A[i][point_max+1];
    		        point_max+=1;
    		    }
    		    else{
    		        sum+=A[i][point_max];
    		    }
		    }
		    
		    //Only Diagonally Left possible
		    else if(point_max==n-1)
		    {
		        if(A[i][point_max-1]>A[i][point_max])
    		    {
    		        sum+=A[i][point_max-1];
    		        point_max=point_max-1;
    		    }
    		    else{
    		        sum+=A[i][point_max];
    		    }
		    }
		    else if(point_max==0)
		    {
		        if(A[i][point_max+1]>A[i][point_max])
    		    {
    		        sum+=A[i][point_max+1];
    		        point_max+=1;
    		    }
    		    else{
    		        sum+=A[i][point_max];
    		    }
		    }
		}
		System.out.println(sum+" ");
	}
}


            