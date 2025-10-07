package middle1.section6.problem6;

import java.time.DayOfWeek;
// 요일 나타내는 클래스
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
// 날짜, 시간 객체를 조정 가능한 클래스

public class problem6_4 
{
    public static void main(String[] args)
    {
        int year = 2024;
        int month = 1;

        LocalDate localDate = LocalDate.of(year, month, 1); // 모든 날짜 클래스는 불변 클래스임
        DayOfWeek firstDayOfWeek = localDate.getDayOfWeek(); // getDayOfWeek(): 해당 객체의 날짜에 따른 요일을 반환
        DayOfWeek lastDayOfWeek = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        // with: 현재 날짜/시간 객체를 조정한 새로운 객체를 반환
        // 날짜 객체가 불변이므로 새로운 값을 가진 객체를 새로 만들어서 그 메서드를 반환
        // localDate의 month의 마지막 일수를 새로운 객체에 담고 with으로 반환한 다음
        // getDayOfWeek()로 마지막 일수의 요일을 lastDaytofWeek 객체에 반환함

        System.out.println("firstDayofWeek = " + firstDayOfWeek);
        System.out.println("lastDayofWeek = " + lastDayOfWeek);
    }
}
