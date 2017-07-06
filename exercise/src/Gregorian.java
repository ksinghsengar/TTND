/**
 * Created by krishan on 6/20/2017.
 */
import java.util.*;
public class Gregorian {

    public static void main(String args[])
    {
        GregorianCalendar cal = new GregorianCalendar();
        int year = cal.get(Calendar.YEAR);

        for(int i= 0;i < 4;i++)
        {
            year = year+i;
           if(cal.isLeapYear(year))
           {
               System.out.println("Next Leap Year: "+year);
               break;
           }

        }
    }
}
