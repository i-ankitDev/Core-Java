import java.util.Calendar;

public class Calendar_Class {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.getTimeZone().getDisplayName());
        System.out.println(c1.getTime());
        c1.add(Calendar.YEAR,4);
        System.out.println("After 4 years : "+c1.getTime());
        System.out.println("Current going week is : "+c1.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Total number of weeks in a year : "+c1.getWeeksInWeekYear());
        System.out.println(c1.getCalendarType());
    }
}
