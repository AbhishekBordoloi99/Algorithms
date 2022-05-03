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
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=sc.nextInt();
		    }
		}
		String st="";
		for(int i=0;i<n;i++)
		{
		    st+=String.valueOf(a[0][i]);
		}
		st=st+st;
		System.out.println(st);
		int flag=0;
		for(int i=1;i<n;i++)
		{   
		    String curr_st="";
		    for(int j=0;j<n;j++)
		    {
		        curr_st+=String.valueOf(a[i][j]);
		    }
		    if(!(st.contains(curr_st)))
		    {
		        flag=1;
		        break;
		    }
		    
		}
		if(flag==1)
		{
		    System.out.println("No");
		}
		else{
		    System.out.println("Yes");
		}
		
	}
}
