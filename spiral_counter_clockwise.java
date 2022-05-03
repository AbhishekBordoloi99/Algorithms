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
		int A[][]=new int[N][N];
		for(int i=0;i<N;i++)
		{
		    for(int j=0;j<N;j++)
		    {
		        A[i][j]=sc.nextInt();
		    }
		}
		int T=0,B=N-1,L=0,R=N-1;
		int dir=1;
		while(T<=B && L<=R)
		{
		    if(dir==1)
		    {
		        for(int i=T;i<=B;i++)
		        {
		            System.out.print(A[i][L]+" ");
		            
		        }
		        L++;
		    }
		    else if(dir==2)
		    {
		        for(int i=L;i<=R;i++)
		        {
		            System.out.print(A[B][i]+" ");    
		            
		        }
		        B--;
		    }
		    else if(dir==3)
		    {
		        for(int i=B;i>=T;i--)
		        {
		            System.out.print(A[i][R]+" ");
		            
		        }
		        R--;
		    }
		    else if(dir==4)
		    {
		        for(int i=R;i>=L;i--)
		        {
		            System.out.print(A[T][i]+" ");
		            
		        }
		        T++;
		    }
		    
		    dir=(dir+1)%4;
		    
		}
}
}
