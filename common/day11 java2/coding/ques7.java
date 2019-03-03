package assignment2;

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Q7 WAP to convert seconds into days, hours, minutes and seconds.
        System.out.println("enter the seconds ");
        int sec=sc.nextInt();
        int days=sec/86400;
        sec=sec % 86400;
        int hour = sec / 3600;
        sec %= 3600;
        int minutes = sec / 60 ;
        sec %= 60;
        int seconds = sec;

        System.out.println("Days : " + days );
        System.out.println("Hours : " + hour );
        System.out.println("Minutes : " + minutes);
        System.out.println("Seconds : " + seconds );




    }
}
