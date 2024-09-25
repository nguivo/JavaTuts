import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class T007DateTime {

    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        LocalDateTime dates = LocalDateTime.now();

        DateTimeFormatter myFormats = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDate.format(myFormats);

        System.out.println(myDate);
        System.out.println(myTime);
        System.out.println(dates);
        //System.out.println(formattedDate);
    }
}
