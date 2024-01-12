import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy & H:m:s a");
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter dtf3 = DateTimeFormatter.ISO_TIME;
        String myDate1 = dt.format(dtf);
        String myDate2 = dt.format(dtf2);
        String myDate3 = dt.format(dtf3);
        System.out.println(myDate1);
        System.out.println(myDate2);
        System.out.println(myDate3);
    }
}
