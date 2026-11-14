package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class App2 {


    public static void main(String[] args) throws ParseException {

        /*Calendar calendar = Calendar.getInstance();

        Date date = calendar.getTime();
        System.out.println(date);

        System.out.println( calendar.get( Calendar.YEAR ) );
        System.out.println( calendar.get( Calendar.MONTH ) );

        System.out.println( calendar.get(  Calendar.DAY_OF_YEAR) );
        System.out.println( calendar.get( Calendar.DAY_OF_MONTH ) );
        System.out.println( calendar.get( Calendar.DAY_OF_WEEK ) );*/

        /*Calendar calendar = new GregorianCalendar();

        calendar.add( Calendar.DATE , 1 );

        System.out.println(calendar.getTime());*/


        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date: (dd/MM/yyyy) ");
        String str = scanner.nextLine(); // 12/01/2026


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "dd/MM/yyyy" );
        Date date = simpleDateFormat.parse(str);
        System.out.println(date);*/

        /*Date date = new Date();

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat( "dd/MM/yyyy HH:mm:ss" );

        String formatted = simpleDateFormat2.format(date);
        System.out.println(formatted);*/


        /*String str = "10/11/2025 15:30:45";

        SimpleDateFormat dateFormat = new SimpleDateFormat( "dd/MM/yyyy HH:mm:ss" );

        Date date = dateFormat.parse(str);
        System.out.println(date);*/


        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy ");

        String formatted = dateFormat.format(date);
        System.out.println(formatted );


    }

}
