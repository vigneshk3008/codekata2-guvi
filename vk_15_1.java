import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner kbd = new Scanner(System.in);
    System.out.println("Enter any sentence or word combination: ");
    String myString = kbd.nextLine();
    String result = "";
    int count = 0;

    String[] words = myString.split("\\s+");
    System.out.println(words.length);
    //for(int a=0;a<words.length;a++)
        //System.out.println(words[a]);
    for(int i = 0; i < words.length; i++) {
        //System.out.println(words[i]);
        for(int j = 0; j < words.length; j++) {
            //System.out.println(words[j]);
            for(int k = 1; k < words.length/2; k++) {
                //System.out.println(words[k]);
                char temp = words[i].charAt(k);
                if(temp == words[i].charAt(k-1)) {
                    count++;
                    System.out.println(words[i]+"\t"+words[j]+"\t"+words[k]+"\t"+count);
                }
            }
            }
        }
    }
}
