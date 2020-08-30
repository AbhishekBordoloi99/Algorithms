/* package codechef; // don't place package name! */

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
		Map<Character,Integer> mp= new HashMap<>();
		String st=sc.nextLine().toLowerCase();
		char ch[]=st.toCharArray();
		for(char c:ch)
		{
		    if(mp.containsKey(c))
		    {
		        mp.put(c,mp.get(c)+1);
		    }
		    else
		    {
		        mp.put(c,1);
		    }
		}
		int max=0;
		char elem=ch[0];
		for(int i=0;i<ch.length;i++)
		{
		    if(mp.get(ch[i])>=max)
		    {
		        max=mp.get(ch[i]);
		        elem=ch[i];
		    }
		}
		System.out.println(mp);
		System.out.println(elem);
	}
}
