package Chapter10;

import java.util.Calendar;

public class CalendarEx2 {
    public static void main(String[] args) {

        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2015, 7, 15);
        System.out.println(toString(date1));


    }

    private static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH) + 1) + "월" + date.get(Calendar.DATE) + "일";
    }

}
