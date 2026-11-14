package date;

import java.util.Date;
import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {


        /*long millis = System.currentTimeMillis();


        Date date = new Date( millis );

        Date now = new Date();

        System.out.println( now.after(date) );*/


/*        Scanner scanner = new Scanner(System.in);

        System.out.print( "Enter amount: ");
        double summa = scanner.nextDouble();


        Date date = new Date( System.currentTimeMillis() + (1000*4) );

        System.out.print("Enter code: ");
        int code = scanner.nextInt();


        Date now = new Date();
        if ( now.before( date ) ) {
            System.out.println( "Success" );
        }else {
            System.out.println( "Fail" );
        }*/


        /*Date date = new Date();
        date.setTime( System.currentTimeMillis() +  (1000 * 60 * 60 * 24) );

        System.out.println(date);*/

        Date date = new Date();

        System.out.println(date);

        date.setTime(System.currentTimeMillis() + (1000 * 60 * 60 * 24));

        System.out.println(date);

        date.setTime(System.currentTimeMillis() + (1000 * 60 * 60 * 24));

        System.out.println(date);





    }

}
