import java.util.*;
public class DateAndTime {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println("Total years passed since 1970 : "+System.currentTimeMillis()/1000/3600/24/365);
        Date d = new Date();
        Date d1 = new Date(2023,8,7);
        System.out.println(d);
        System.out.println(d.compareTo(d1));

    }
}
