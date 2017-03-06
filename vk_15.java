import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
         String s1,s2;
         double d1,d2,d3=0;
         Scanner in=new Scanner(System.in);
         s1=in.nextLine();
         s2=in.nextLine();
         d1=Double.parseDouble(s1);
         d2=Double.parseDouble(s2);
         if((d1!=0 && d2!=0) && (d1>0 && d2>0))
         {   
             d3=d1*d2;
             System.out.println(d3);
         }     
         else
            System.out.println("Note: The numbers can be arbitrarily large and are non-negative.");
         
     }
}
