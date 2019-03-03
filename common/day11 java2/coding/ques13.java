package assignment2;


import java.util.Scanner;

class ToYoung extends RuntimeException
{
    public ToYoung(String message)
    {
        super(message);
    }
}

class Toold extends RuntimeException
{
    public Toold(String message)
    {
        super(message);
    }
}






public class ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age for marraige between 18 to 40");
        int age = sc.nextInt();
        if (age < 18) {
            throw new ToYoung("you are to young for marriage");
        }
        else if(age > 40)
        {
            throw new Toold("you are to old for marriage plz wait for some more time");

        }
        else
            System.out.println("you will get marry");
    }
}
