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
            int b[][]=new int[n][n];
            int c[][]=new int[n][n];
            for (int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            
            for (int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
            
            System.out.println("Matrix A:");
            for (int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            
            System.out.println("Matrix B:");
            for (int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }
            int sum=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    for(int k=0;k<n;k++)
                    {
                        sum+=a[i][k]*b[k][j];
                    }
                    c[i][j]=sum;
                    sum=0;
                }
                
            }
            
            System.out.println("Matrix C:");
            for (int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
	}
}
