package Assignment4;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Eight {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = simpleDateFormat.format(new Date());
        System.out.println("Today's date in dd-MMMM-yyyy format is: " + date);
    }
}
