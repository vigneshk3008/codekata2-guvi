import java.util.*;
import java.io.*;
public class HelloWorld{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char fc=s1.charAt(0);
        String res="";
        res=res+Character.toUpperCase(fc);
        for(int i=1;i<s1.length();i++)
        {
            char cc=s1.charAt(i);
            char pc=s1.charAt(i-1);
            if(pc==' ')
            {
                res=res+Character.toUpperCase(cc);
            }
            else
                res=res+cc;
        }System.out.print("Camel Case is\n\t"+res+"\n");
    }
}
