import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.util.Locale.*;

public class Exercise9 {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Current Date and Time: "+dateFormat.format(date));

        String [] zones = {"Africa/Dakar","Asia/Kolkata","America/Los_Angeles","Europe/Copenhagen"};
        for(String zone:zones ) {
            dateFormat.setTimeZone(TimeZone.getTimeZone(zone));
            String time = dateFormat.format(date);
            System.out.println("Time at "+zone+" is : "+time);
        }
        System.out.println("\n");
        Locale [] locales = {US, UK, GERMANY, FRANCE,CANADA,CHINA,ITALY,JAPAN};
        for(Locale locale: locales){
            System.out.println("The Date for "+locale.getDisplayCountry()+": ");
            dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
            System.out.println(dateFormat.format(date));
        }
    }
}
