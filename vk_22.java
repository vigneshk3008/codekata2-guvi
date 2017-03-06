import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
         int n;
         Scanner in=new Scanner(System.in);
         n=in.nextInt();
         int temp=0;
         //int []num=new int[n];
         for(int i=1;i<=n;i++)
         {
            temp=temp+i; 
         }System.out.println("The minimum number of candies given to "+n+" Chindren is "+temp);
         
     }
}
