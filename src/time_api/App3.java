package time_api;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App3 {



    private List<String> posts = new ArrayList<>();


    // controller   --   service   --   dao


    public static void main(String[] args) {


//        LocalTime localTime = LocalTime.now( ZoneId.of("America/Los_Angeles") );

        /*System.out.println(  localTime.getHour()  );
        System.out.println( localTime.getMinute() );
        System.out.println( localTime.getSecond() );
        System.out.println( localTime.getNano() );*/



//        LocalDate localDate = LocalDate.now( ZoneId.of("America/Los_Angeles") );

        /*System.out.println(localDate.getYear() );
        System.out.println( localDate.getMonthValue() );
        System.out.println( localDate.getDayOfMonth() );

        System.out.println("localDate.getDayOfWeek() = " + localDate.getDayOfWeek().getValue());
        System.out.println("localDate.getDayOfYear() = " + localDate.getDayOfYear());*/


        /*LocalDate localDate = LocalDate.of( 2000, 10, 15 );

        System.out.println(localDate);*/

        /*LocalTime localTime =  LocalTime.now().plusSeconds(5); // 16:02:45


        System.out.print( "Enter verification code: " );
        String code = new Scanner(System.in).nextLine(); // 1234


        LocalTime now = LocalTime.now(); // 16:02:47

        if ( now.isBefore( localTime ) ) {
            System.out.println("Welcome");
        }
        else {
            System.out.println("Code Expired");
        }*/


        /*String str = "2025-10-14";

        LocalDate parsed = LocalDate.parse(str);

        System.out.println(parsed);*/


        /*LocalDateTime localDateTime = LocalDateTime.now();

        LocalDateTime res = localDateTime.plusDays(5);

        System.out.println(res);*/


        /*Set<String> set = ZoneId.getAvailableZoneIds();

        for (String s : set) {
//            System.out.println(s);
        }

        ZonedDateTime zonedDateTime = ZonedDateTime.now( ZoneId.of( "America/Los_Angeles" ) );
        System.out.println(zonedDateTime);*/




        /*String str = "15/10/2025";


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate = LocalDate.parse( str, formatter );

        System.out.println( localDate );*/


        /*LocalDateTime localDateTime1 = LocalDateTime.now();

        LocalDateTime localDateTime2 = LocalDateTime.now().plusHours(2).plusMinutes(30);

        Duration duration = Duration.between( localDateTime1, localDateTime2 );

        System.out.println( duration.toHours() );
        System.out.println( duration.toMinutes() - ( duration.toHours() * 60 ) );*/


        /*LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.now().plusYears(1).plusMonths(1).plusDays(5);


        System.out.println(localDate1);
        System.out.println(localDate2);

        Period period = Period.between( localDate1, localDate2 );

        System.out.println( period.getYears() );
        System.out.println( period.getMonths() );
        System.out.println( period.getDays() );*/








    }

}
