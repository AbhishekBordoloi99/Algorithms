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
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=sc.nextInt();
		    }
		}
		
		int l=0,r=n-1,t=0,b=n-1;
		int dir=1;
		while(l<=r && t<=b)
		{
		    if(dir==1)
		    {
		        for (int i=l;i<=r;i++)
		        {
		            System.out.print(a[t][i]+" ");
		        }
		        t++;
		    }
		    else if(dir==2)
		    {
		        for(int i=t;i<=b;i++)
		        {
		            System.out.print(a[i][r]+" ");
		        }
		        r--;
		    }
		    else if(dir==3)
		    {
		        for(int i=r;i>=l;i--)
		        {
		            System.out.print(a[b][i]+" ");
		        }
		        b--;
		    }
		    else if(dir==4)
		    {
		        for(int i=b;i>=t;i--)
		        {
		            System.out.print(a[i][l]+" ");
		        }
		        l++;
		    }
		    dir=(dir+1)%4;
	    
		    
		}
	}
}
