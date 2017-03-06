import java.util.*;
import java.io.*;
public class HelloWorld{
    public static boolean areIsomorphic(String s1, String s2) {
        Map<Character, Integer> freqMap1 = new HashMap<>();
        Map<Character, Integer> freqMap2 = new HashMap<>();

        for (int i=0; i<s1.length(); i++) {
            if (freqMap1.containsKey(s1.charAt(i))) {
                int freq1 = freqMap1.get(s1.charAt(i));
                freqMap1.put(s1.charAt(i), freq1 + 1);
            } else {
                freqMap1.put(s1.charAt(i), 1);
            }

        }

        for (int i=0; i<s2.length(); i++) {
            if (freqMap2.containsKey(s2.charAt(i))) {
                int freq2 = freqMap2.get(s2.charAt(i));
                freqMap2.put(s2.charAt(i), freq2 + 1);
            }
            else {
                freqMap2.put(s2.charAt(i), 1);
            }

        }

        List<Integer> freqList1 = new ArrayList<>();
        List<Integer> freqList2 = new ArrayList<>();

        for (Map.Entry entry: freqMap1.entrySet()) {
            freqList1.add((Integer) entry.getValue());
        }

        for (Map.Entry entry: freqMap2.entrySet()) {
            freqList2.add((Integer) entry.getValue());
        }

        Collections.sort(freqList1);
        Collections.sort(freqList2);

        return freqList1.equals(freqList2);

    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        System.out.println(areIsomorphic(s1, s2));
    }
}
