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
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    A[i]=sc.nextInt();
		}
		Arrays.sort(A);
		int l=0,r=n-1;
		int l_index=0,r_index=n-1;
		int min_sum=A[l]+A[r];
		while(l<=r)
		{
		    int sum2=A[l]+A[r];
		    if(Math.abs(sum2)<=Math.abs(min_sum))
		    {
		        min_sum=sum2;
		        l_index=l;
		        r_index=r;
		    }
		    if(sum2<0)
		    {
		        l++;
		    }
		    else{
		        r--;
		    }
		    
		}
		
		System.out.println(A[l_index]+" "+A[r_index]);
	}
}
