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
		int r_a,c_a,r_b,c_b;
		r_a=3; c_a=2; r_b=2; c_b=3;
		int a[][]={ { 1, 2 },
                      { 3, 4 },
                      { 1, 0 } };
		int b[][]={ { 0, 5, 2 },
                      { 6, 7, 3 } };
		
		int c[][]=new int[r_a*r_b][c_a*c_b];
		for(int i=0;i<r_a;i++)
		{
		    for(int j=0;j<c_a;j++)
		    {
		        for(int l=0;l<c_a;l++)
		        {
		            for(int k=0;k<c_b;k++)
		            {
		                c[i+k][l+j]=a[i][l]*b[j][k];
		                System.out.print(c[i+k][l+j]+"   ");
		            }
		        }
		        System.out.println();
		    }
		}
	}
}
