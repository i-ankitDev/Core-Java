import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class PSQ2_3_4 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        Calendar c1= Calendar.getInstance();
        System.out.println(c1.get(Calendar.HOUR_OF_DAY)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));
        LocalTime t = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s");
        String time = t.format(dtf);
        System.out.println(time);
    }
}
