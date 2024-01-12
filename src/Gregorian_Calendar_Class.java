import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian_Calendar_Class {
    public static void main(String[] args) {
        GregorianCalendar g1 = new GregorianCalendar();
//        System.out.println(g1);
        System.out.println(g1.isLeapYear(2014));
        System.out.println(g1.getTimeZone().getID());
        System.out.println(g1.getTime());
        g1.roll(Calendar.YEAR,true);
        g1.roll(Calendar.MONTH,false);
        g1.roll(Calendar.DATE,true);
        System.out.println(g1.getTime());
        System.out.println(g1.hashCode());
        System.out.println(TimeZone.getAvailableIDs()[120]);
    }
}
