package chap07.sec02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
        String formatted = now.format(f);
        System.out.println("포맷된 날짜/시간: " + formatted);
    }
}
