import java.util.*;
import java.io.*;
public class HelloWorld{
     public static void main(String []args){
        Scanner in= new Scanner(System.in);
        String n1=in.nextLine();
        char ch[]=new char[n1.length()];
        int n2[]=new int[n1.length()];
        for(int i=0;i<n1.length();i++)
        {
            ch[i]=n1.charAt(i);
            n2[i]=(int)ch[i];
            //System.out.println(n2[i]);
        }
        Arrays.sort(ch);
        //System.out.println(ch[1]);
        System.out.println("The result is : "+arrFun(ch));
     }
     private static char arrFun(char[] ch)
     {
         char result='\0';
         for(int i=0;i<ch.length;i++)
         {
             result^=ch[i];
             //System.out.print(result);
         }return result;
     }
}
