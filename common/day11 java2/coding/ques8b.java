package assignment2;

import java.util.Scanner;

public class ques8b {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = sc.nextLine();
        if (str.equals("done"))
        {}
        else{
            do {
                if (str.charAt(0) == str.charAt(str.length() - 1)) {
                    System.out.println("First and last character are equals for the word: " + str);
                } else {
                    System.out.println("First and last character are NOT equals for the word: " + str);
                }
                str = sc.next();
            } while (!str.equals("done"));
        }
    }
}
