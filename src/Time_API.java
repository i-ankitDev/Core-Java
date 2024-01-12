import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time_API {
    public static void main(String[] args) {
        Clock c = Clock.systemDefaultZone();
        System.out.println(c);
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        LocalDate d1 = LocalDate.parse("2025-02-24");
        System.out.println(d1.withYear(2026));
    }
}
