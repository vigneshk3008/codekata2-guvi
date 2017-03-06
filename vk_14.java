import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
         String s1;
         int j;
         Scanner in=new Scanner(System.in);
         s1=in.nextLine();
         char []arr=new char[s1.length()];
         char tem;
         j=s1.length();
         j--;
         arr=s1.toCharArray();
         for(int i=0;i<s1.length()/2;i++)
         {
             //arr[i]=s1.charAt(i);
             //System.out.print(arr[i]);
             tem=arr[i];
             arr[i]=arr[j];
             arr[j]=tem;
             j--;
         }
         for(int i=0;i<s1.length();i++)
         {
             System.out.print(arr[i]);
         }System.out.print("\n");
         for(int i=0;i<arr.length;i++)
         {
             if((arr[i]=='a') || (arr[i]=='e') || (arr[i]=='i') || (arr[i]=='o') || (arr[i]=='u'))
             {
                 arr[i]=arr[i+1];
                 arr[i+1]='\0';
                 i--;
             }
         }
         for(int i=0;i<s1.length();i++)
         {
             System.out.print(arr[i]);
         }System.out.print("\n");
     }
}
