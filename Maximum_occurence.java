/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class maximum_occurence
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
		int l=(n/2);
		int s=0;
		int elem=0,flag=0;
		while(l<n)
		{
		    if(A[s]==A[l])
		    {
		        elem=A[s];
		        flag=1;
		        break;
		    }
		    s++;
		    l++;
		}
		if(flag==1)
		{
		    System.out.println(elem);
		}
	}
}
