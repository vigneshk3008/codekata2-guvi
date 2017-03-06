import java.util.*;
import java.io.*;
public class HelloWorld{
    public static void main(String args[]) {
        String s1;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        int l=s1.length();
        l--;
        char [] rev=s1.toCharArray();
        char temp;
        for(int i=0;i<s1.length()/2;i++)
        {
            temp=rev[i];
            rev[i]=rev[l];
            rev[l]=temp;
            l--;
        }
        s1=new String(rev);
        System.out.print(s1+"\n");
    }
}
