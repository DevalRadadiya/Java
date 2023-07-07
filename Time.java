import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yy HH:mm:ss");

        System.out.println(date);
        System.out.println(time);

        String formatedDate = format.format(date);
        System.out.println(formatedDate);
    }
}
