import java.util.*;
import java.io.*;
public class HelloWorld{
    public static void main(String args[]) {
        int intoInt;
        String s;
        Scanner scan=new Scanner(System.in);
        s=scan.nextLine();
        char[]a=s.toCharArray();
        intoInt=a[0];
        System.out.println("This is an integer: "+intoInt);
    }
}
