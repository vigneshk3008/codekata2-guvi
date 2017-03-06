import java.util.*;
import java.io.*;
public class HelloWorld{
    public static void main(String []args){
         String day,p;
         Scanner in=new Scanner(System.in);
         day=in.nextLine();
         p=day.toLowerCase();
         if(p.equals("monday") || p.equals("tuesday") || p.equals("wednesday") || p.equals("thursday") || p.equals("friday") || p.equals("saturday"))
            System.out.println("true");
        else if(p.equals("sunday"))
            System.out.println("false");
        else 
            System.out.println("Invalid::Please enter any days of the week");
    }
}
