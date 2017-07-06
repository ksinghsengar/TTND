import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Exercise8 {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date = new Date();
        System.out.println("Current Date: "+dateFormat.format(date));

    }
}
