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
		
		int dir=1;
		for(int i=0;i<n;i++)
		{
		    int r=i;
		    for(int j=0;j<=i;j++)
		    {
		        if(dir==1)
		        {
		            System.out.print(A[r][j]+" ");
		            r--;
		        }
		        else if(dir==2)
		        {
		            System.out.print(A[j][r]+" ");
		            r--;
		        }
		    }
		    if (dir==1)
		        dir=2;
		        
		    else if(dir==2)
		        dir=1;
		    
		}
		
		for(int i=1;i<n;i++)
		{
		    int r=i;
		    for(int j=n-1;j>=i;j--)
		    {
		        if(dir==1)
		        {
		            System.out.print(A[j][r]+" ");
		            r++;
		        }
		        else if(dir==2)
		        {
		            System.out.print(A[r][j]+" ");
		            r++;
		        }
		    }
		    if (dir==1)
		        dir=2;
		        
		    else if(dir==2)
		        dir=1;
		}
	}
}
