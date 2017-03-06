import java.util.*;
import java.io.*;
public class HelloWorld{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char []c=s1.toCharArray();
        int i=0;
        int j=1;
        char tem;
        for(i=0;i<s1.length()/2;)
        {
            tem=c[i];
            c[i]=c[j];
            c[j]=tem;
            j+=2;
            i+=2;
        }
        for(i=0;i<s1.length();i++)
        {
            System.out.print(c[i]);
        }System.out.print("\n");
    }
}
