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
		float a[][]=new float[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=sc.nextFloat();
		    }
	    }
	    int flag=0;
	    for(int i=0;i<n;i++)
	    {
	        float sum=0;
	        for(int j=0;j<n;j++)
	        {
	            sum+=a[i][j];
	        }
	        if(sum!=1)
	        {
	            flag=1;
	            break;
	        }
	    }
	    if(flag==0)
	    {
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
    }
}
