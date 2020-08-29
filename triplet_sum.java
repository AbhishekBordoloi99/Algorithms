
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
		int X=sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++)
		{
		    A[i]=sc.nextInt();
		}
		Arrays.sort(A);
		int l=0,mid=1,r=n-1;
		for(int i=0;i<n-2;i++)
		{
		    l=i;mid=i+1;r=n-1;
		    while(mid<r)
		    {
		        int sum=A[l]+A[mid]+A[r];
		        
		        if(sum==X)
		        {
		            System.out.println(A[l]+" "+A[mid]+" "+A[r]);
		            flag=1;
		            break;
		        }
		        else if(sum>X)
		        {
		            r--;
		        }
		        else if(sum<X)
		        {
		            mid++;
		        }
		    }
		    if(flag==1)
		    {
		        break;
		    }
		}
	}
}
