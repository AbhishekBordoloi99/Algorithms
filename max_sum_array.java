import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        long sum=a[n-1],count=1;
        for(int i=n-2;i>=0;i--)
        {
            if(sum+a[i]>=sum)
            {
                sum+=a[i];
                count++;
            }
        }
        System.out.println(sum+" "+count);
    }
}
