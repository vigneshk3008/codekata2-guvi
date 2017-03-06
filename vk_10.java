import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
         int h1,h2,m1,m2,rt=0,th1,th2,tm1,tm2;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the first time hh and mm");
         h1=s.nextInt();
         m1=s.nextInt();
         System.out.println("Enter the second time hh and mm");
         h2=s.nextInt();
         m2=s.nextInt();
         th1=h1*60;
         th2=h2*60;
         tm1=m1+th1;
         tm2=m2+th2;
         rt=tm1-tm2;
            if(rt>0)
                System.out.println("The min between "+h1+":"+m1+" and "+h2+":"+m2+" is: "+rt);
            else
                System.out.println("The min between "+h1+":"+m1+" and "+h2+":"+m2+" is: "+(-rt)+" min");
     }
}
