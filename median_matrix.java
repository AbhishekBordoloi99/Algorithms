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
		int arr[]=new int[n*n];
		int c=0;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=sc.nextInt();
		        arr[c]=a[i][j];
		        c++;
		    }
		}
		Arrays.sort(arr);
		if((n*n)%2==0)
		{
		    System.out.println(arr[((n*n)+1)/2]);
		}
		else{
		    
		    int r=(arr[(n*n)/2]+arr[((n*n)+1)/2])/2;
		    System.out.println(r);
		}
		
	}
}
