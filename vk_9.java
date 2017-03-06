import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
         int l,m,n,p=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the start values");
l=in.nextInt();
System.out.println("Enter the end values");
m=in.nextInt();
for(int i=l;i<=m;i++)
{
n=1;
for(int j=2;j<=i;j++)
{
if(i%j==0)
{
n++;
}
}
if(n==2)
{
p++;
}
}
System.out.println(p);
     }
}
