import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Codechef obj=new Codechef();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    A[i]=sc.nextInt();
		}
		int max_index=obj.maximum(A);
		int min=9999;
		for(int i=0;i<max_index;i++)
		{
		    if(A[i]<=min)
		    {
		        min=A[i];
		    }
		}
		System.out.println(A[max_index]-min);
	}
	
	public int maximum(int A[])
	{   
	    int max=A[0], index=0;
	    for(int i=1;i<A.length;i++)
	    {
	        if(A[i]>=max)
	        {
	            max=A[i];
	            index=i;
	        }
	    }
	    
	    return index;
	}
}
