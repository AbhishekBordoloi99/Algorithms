import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int s=sc.nextInt();
        int T=sc.nextInt();
        int count=0;
        for(int i=x;i<=x+s;i++)
        {
            for(int j=y;j<=y+s;j++)
            {
                if(i+j<=T)
                {
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
