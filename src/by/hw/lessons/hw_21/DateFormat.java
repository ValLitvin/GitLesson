package by.hw.lessons.hw_21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormat {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru"));
        String formattedDate = currentDate.format(dateFormatter);
        System.out.println("1. " + formattedDate);

        System.out.println("-----------");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy, hh:mm:ss a", new Locale("ru"));
        String formattedDateTime = now.format(dateTimeFormatter);
        System.out.println("2. " + formattedDateTime);

        System.out.println("-----------");

        String input1 = "2023-03-19 : 10:12:24 AM";
        DateTimeFormatter inputFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a");
        LocalDateTime dateTime1 = LocalDateTime.parse(input1, inputFormatter1);
        System.out.println("3. " + dateTime1);

        System.out.println("-----------");

        String input2 = "пн 20.03.23 г. время: 15:07:28";
        DateTimeFormatter inputFormatter2 = DateTimeFormatter.ofPattern("E dd.MM.yy 'г. время:' HH:mm:ss", new Locale("ru"));
        LocalDateTime dateTime2 = LocalDateTime.parse(input2, inputFormatter2);
        System.out.println("4. " + dateTime2);

        System.out.println("-----------");

        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy 'время:' hh.mm.ss a", new Locale("ru"));
        String customFormatted = now.format(customFormatter);
        System.out.println("5. " + customFormatted);
    }
}