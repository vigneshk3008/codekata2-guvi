import java.util.*;
import java.io.*;
public class HelloWorld{
    public static void main(String args[]) {
        int num,fact=1;
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        for(int i=2;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of given number "+num+" is: "+fact);
    }
}
