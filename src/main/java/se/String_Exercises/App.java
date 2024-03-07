package se.String_Exercises;



import java.time.*;
import java.time.format.DateTimeFormatter;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  {
        /*
        Introduction
         */
        LocalDate ld = LocalDate.of(2024, Month.FEBRUARY,6);
        System.out.println(ld);

        ld = ld.plusDays(1);
        System.out.println(ld);

        LocalTime lt = LocalTime.of(14,38);
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.of(ld,lt);
        System.out.println(ldt);

        ZonedDateTime zdt = ZonedDateTime.of(ldt,ZoneId.of("Europe/Athens"));
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM");
        String formattedDate = currentDate.format(formatter);
        System.out.print("Q.2) ");
        System.out.println(formattedDate);

        /*
        Exercise3:
        Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO format.
         */
        // String [] allDays = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        DateTimeFormatter dayName = DateTimeFormatter.ofPattern("EEEE");
        String currentDayName = dayName.format(currentDate);
        System.out.println("Day name: " + currentDayName);
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        // Iso date
        String isoDate = currentDate.format(isoFormatter);
        System.out.println("ISO: " + isoDate);

        // ISO for 7 days
        System.out.println("Q.3) ");
        for (int i= 0; i<7;i++){
            System.out.println(currentDate.plusDays(i));
        }

        /*
        Exercise 4:
        Create a LocalDate object from a String by using the .parse() method.
         */
        String dateS = "2020-02-01";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateS,formatter2);
        System.out.println("Q.4) " +date);


    }
}




