package se.String_Exercises;



import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        /*
        Introduction
         */
        LocalDate ld = LocalDate.of(2024, Month.FEBRUARY, 6);
        System.out.println(ld);

        ld = ld.plusDays(1);
        System.out.println(ld);

        LocalTime lt = LocalTime.of(14, 38);
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        System.out.println(ldt);

        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Europe/Athens"));
        System.out.println(zdt);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd  yyyy");
        System.out.println(ld.format(dtf));
        System.out.println(dtf.format(ld));


        /*
        Exercise 1:
        Create a LocalDate of the current day and print it out
         */
        System.out.println("___________________");
        LocalDate currentDate = LocalDate.now();
        System.out.print("Q.1) ");
        System.out.println("Today " + currentDate);

        /*
        Exercise2:
        Create a LocalDate of the current day and print it out in the following
        pattern using DateTimeFormatter: Torsdag 29 mars.
         */
        LocalDate currentDate0 = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM");
        String formatterDate0 = currentDate0.format(formatter);
        System.out.println("Q.2) " + formatterDate0);


        /*
        Exercise3:
        Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO format.
         */
        LocalDate today = LocalDate.now();
        LocalDate lastMonday = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        for (int i = 0; i < 7; i++) {
            System.out.println(lastMonday.plusDays(i));
        }
        /*
        Exercise 4:
        Create a LocalDate object from a String by using the .parse() method.
         */

        String dateString = "2020-02-01";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString,formatter2);
        System.out.println("Q.4) " +date);

        /*
        Exercise5:
        The date time api provides enums for time units such as day and month.
        Create a LocalDate of your birthday and extract the day of week for that date.
        Ex. 1945-05-08 -> TUESDAY
         */
        LocalDate dateBirthday = LocalDate.of(1990,3,31);
        DayOfWeek birthday = DayOfWeek.from(dateBirthday);
        System.out.println("Q.5) " + birthday);


        /*
        Exercise6:
        Create a LocalDate of current date plus 10 years and minus 10 months.
        From that date extract the month and print it out.
         */
        LocalDate currentDate6 = LocalDate.now().plusYears(10).minusMonths(5);
        Month monthName = Month.from(currentDate6);
        System.out.println("Q.6) " +monthName);

    }
}






