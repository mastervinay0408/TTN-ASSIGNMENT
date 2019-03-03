package Assignment4;

import java.sql.Array;
import java.util.*;

public class Third {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String input = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        char[] arr = input.toCharArray();

        for (char c : arr) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
        System.out.println(entries);


    }
}