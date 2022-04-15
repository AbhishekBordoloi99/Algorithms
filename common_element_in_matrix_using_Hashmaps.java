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
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=sc.nextInt();
		    }
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<c;i++)
		{
		    map.put(a[0][i],1);
		}
		for(int i=1;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        if(map.containsKey(a[i][j]) && map.get(a[i][j])<=i)
		        {
		            map.put(a[i][j], map.get(a[i][j])+1);
		        }
		    }
		}
		for(int val: map.keySet())
		{
		    if(map.get(val)==r)
		    {
		        System.out.println(val+" ");
		    }
		}
	}
}
