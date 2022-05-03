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
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();
		int a[][]=new int[N][M];
		for(int i=0;i<N;i++)
		{
		    for(int j=0;j<M;j++)
		    {
		        a[i][j]=sc.nextInt();
		    }
		}
		int temp[]=new int[M];
		K=K%M;
		for(int i=0;i<N;i++)
		{
		    for(int j=0;j<M-K-1;j++)
		    {
		        temp[j]=a[i][j];
		    }
		    for(int j=M-K-1;j<M;j++)
		    {
		        a[i][j-M+K+1]=a[i][j];
		    }
		    for(int j=K;j<M;j++)
		    {
		        a[i][j]=temp[j-K];
		    }
		}
		
		for(int i=0;i<N;i++)
		{
		    for(int j=0;j<M;j++)
		    {
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
