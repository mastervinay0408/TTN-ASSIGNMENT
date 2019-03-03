package Assignment4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Nine {
    public static void main(String[] args) {


        Date today = new Date();
        dispAMR(today);
        dispIST(today);
        dispGMT(today);

    }

    private static void dispGMT(Date today) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss", Locale.ENGLISH);
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));        //setting time zone GMT
        System.out.println("Date in GMT is : " + dateFormat.format(today));
    }


    private static void dispAMR(Date today) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss", Locale.ENGLISH);
        dateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));        //setting time zone JST
        System.out.println("Date in AMR is : " + dateFormat.format(today));
    }
    private static void dispIST(Date today) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss", Locale.ENGLISH);
        dateFormat.setTimeZone(TimeZone.getTimeZone("IST"));        //setting time zone IST
        System.out.println("Date in IST is : " + dateFormat.format(today));
    }


}