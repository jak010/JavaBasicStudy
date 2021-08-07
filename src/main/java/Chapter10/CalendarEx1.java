package Chapter10;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {

        Calendar today = Calendar.getInstance();

        System.out.println(today.get(Calendar.YEAR));
        System.out.println(today.get(Calendar.MONTH));
        System.out.println(today.get(Calendar.WEEK_OF_YEAR));

        System.out.println("==========================================");
        System.out.println(today.get(Calendar.DATE));
        System.out.println(today.get(Calendar.DAY_OF_MONTH));
        System.out.println(today.get(Calendar.DAY_OF_YEAR));

    }
}
