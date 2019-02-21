public class Question7 {

    /*Question 7: Write a program to print your Firstname,
    LastName & age using static block,
    static method & static variable respectively*/

    private static int age = 21;        //using static variable for age

    static {
        String First_name = "Aman";     //using static block to print first name
        System.out.println("First Name: " + First_name);
    }

    private static void printLastName() {       //using static method to print last name
        String Last_name = "Singh";
        System.out.println("Last Name: " + Last_name);
    }

    public static void main(String[] args) {
        printLastName();    //calling static method to print last name
        System.out.println("AGE: " + age);      //using static variable to print age
    }
}
