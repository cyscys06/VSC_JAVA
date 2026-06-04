package chap07.sec02;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1999, 7, 25);

        System.out.println("오늘 날짜: " + today);
        System.out.println("생일: " + birthday);

        System.out.println("일주일 후: " + today.plusWeeks(1));
        System.out.println("한 달 전: " + today.minusMonths(1));
    }
}
