import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String st=in.nextLine();
        char ch[]=new char[15];
        int count=0,j=0;
        char []ch2=new char[st.length()];
        for (int i=0;i<st.length();i++)
        ch2[i]=st.charAt(i);
        int len=st.length();
        if(len<=12)//the user can give 12 digits only
        {
            for(int i=0;i<15;i++)
            {
              if(count!=3 && count!=7 && count!=11)
              {
                  ch[i]=ch2[j];
                  j++;
                  count++;
              }
              else
              {
                  ch[i]='.';
                  count++;
              }
            }
          
            for(int i=0;i<15;i++)
                System.out.print(ch[i]);
        }
        else
            System.out.println("Your IP numbers should be 12 digits only");
    }
}
