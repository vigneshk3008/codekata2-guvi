import java.util.*;
import java.io.*;
public class HelloWorld
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
	    String str2=in.nextLine();
	    if(str1.length()==str2.length())
	        System.out.println("both are "+anagram(str1,str2));
	    else
	        System.out.println("both are false");
	}
	public static boolean anagram(String str1,String str2)
	{
	    char[] c1=str1.toCharArray();
	    char[] c2=str2.toCharArray();
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    return Arrays.equals(c1,c2);
    }
}     
