public class Question8 {
    public static void main(String[] args) {

        /*Question 8: Write a program to reverse a string and remove character from index 4 to index 9 from the
        reversed string using String Buffer*/

        StringBuffer str = new StringBuffer("EDCBA9876543210");     //Storing a string in a StringBuffer object
        System.out.println("Original String: " + str);
        str.reverse();      //reversing given string
        System.out.println("Reverse String: " + str);
        str.delete(4, 10);    //removing characters from index-4 to index-9 (both inclusive)
        System.out.println("String after removing character from index 4 to 9 (both inclusive): " + str);
    }
}
