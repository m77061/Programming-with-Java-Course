import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class DateInformation {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println(dateTimeFormatter.format(now));
    }
}