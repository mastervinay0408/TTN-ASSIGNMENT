package Assignment4;

import java.util.HashSet;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        //String str ="hi my self sakshi";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("----Printing original string----");
        System.out.println(str);


        HashSet<Character> st = new HashSet<>();
        for(int i =0;i<str.length();i++)
        {
            st.add(str.charAt(i));
        }

        System.out.println("----printing unique characters in a string---- ");

        System.out.println(st);
    }
}