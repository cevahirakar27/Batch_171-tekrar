package day23datetimevarargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {

        LocalDateTime zaman = LocalDateTime.now();
        System.out.println(zaman);   // 2023-06-11T08:54:28.830637900

        LocalDateTime zaman2 = LocalDateTime.of(2023,6,12,17,05);
        System.out.println(zaman2);  // 2023-06-12T17:05

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy  HH:mm");  // 12/Haz/2023  17:06
        String formatlanmisZaman = format1.format(zaman2);
        System.out.println(formatlanmisZaman);
    }
}
