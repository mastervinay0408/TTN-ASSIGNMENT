import java.util.Scanner;

public class Question3 {

    /*Question 3: Write a program to find the number of occurrences of a character in a string without using loop?*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        //using Scanner class to take input from user
        System.out.println("enter the string");
        String str = sc.nextLine();     //storing inputted string into str

        System.out.println("enter the character to find number of its occurrences in the string ");
        char ch = sc.next().charAt(0);      //storing inputted character into ch

        System.out.println("Length Of String:" + str.length());
        System.out.println(
                "Length of String without character: "
                        + str.replaceAll(String.valueOf(ch), "")
                        //removing all the occurrences of inputted character in the string
                        //considering capital and small characters as different
                        .length()); //calculating the length of string after replacement


        int count = str.length() - str.replaceAll(String.valueOf(ch), "").length();
        /*Difference of lengths of 'actual string' and 'string after removing all occurrence of character'
        is equal to number of its occurrence in the string*/

        System.out.println("The occurrence of given character '" + ch + "' is: " + count);
    }
}
