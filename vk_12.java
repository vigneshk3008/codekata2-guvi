import java.util.*;
import java.io.*;
public class HelloWorld{
    public static void main(String []args){
         int n,k;
         Scanner in=new Scanner(System.in);
         n=in.nextInt();
         k=in.nextInt();
         int []num=new int[n];
         for(int i=0;i<n;i++)
         {
             num[i]=in.nextInt();
         }
         while(k>0)
         {
            int temp=num[n-1];
            int i;
            for(i=n-1;i>0;i--)
            {
                num[i]=num[i-1];
            }
            num[0]=temp;
            k--;
         }
         for(int i=0;i<n;i++)
         {
             System.out.print(num[i]);
         }
    }
}
