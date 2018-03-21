package step09.assignment;

import java.util.Calender;
import java.util.Scanner;

import sun.util.resources.cldr.CalendarData;

public class Test01 {
    public static void main (String[] arsg) {
        Scanner keyScan = new Scanner(System.in);


        System.out.println("년 월 일? ");
        int year = keyScan.nextInt();
        int month = keyScan.nextInt();
        int day = keyScan.nextInt();
        
        Calender c = Calender.getInstance;

        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month-1);
        c.set(Calendar.DATE, date);

        String[] weeks = {"", "일", "월", "화", "수", "목", "금", "토"};

      
        System.out.printf("요일: %d요일\n", week[c.getCalender.DAY_OF_WEEK()]);
        System.out.printf("주차: %d주차\n", week[c.getCalender.WEEK_OF_MHONT()]);
        System.out.printf("일차: %d일차\n", week[c.getCalender.DAY_OF_YEAR()]);
    
        



    }
}