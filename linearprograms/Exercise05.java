import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Exercise05 {
    public static void main(String[] args) {
        long x = 128000L;
        x = x * 1000;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(x);
        SimpleDateFormat formatCalendar = new SimpleDateFormat("HHч mmмин ssс");
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        formatCalendar.setTimeZone(timeZone);
        String formattedCalendar = formatCalendar.format(calendar.getTime());
        System.out.println(formattedCalendar);

    }
}
