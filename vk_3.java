import java.util.*;
import java.io.*;
public class HelloWorld{
    public static void main(String args[]) {
        String num;
        Scanner sc= new Scanner(System.in);
        num=sc.nextLine();
        int l=num.length();
        l--;
        char [] rev=num.toCharArray();;
        char temp;
        for(int i=0;i<num.length()/2;i++)
        {
            temp=rev[i];
            rev[i]=rev[l];
            rev[l]=temp;
            l--;
        }
        System.out.println("The reverse of given number "+num+" is:"); 
        for(int i=0;i<num.length();i++)
        {
            System.out.print(rev[i]);
        }System.out.print("\n");
    }
}
