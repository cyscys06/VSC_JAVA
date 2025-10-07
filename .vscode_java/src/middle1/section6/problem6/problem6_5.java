package middle1.section6.problem6;
    
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId; // 지역별 표준 시간대 클래스
import java.time.ZonedDateTime; // 날짜, 시간, 지역별 표준 시간대를 모두 포함하는 클래스

public class problem6_5 
{
    public static void main(String[] args) 
    {
        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0, 0), ZoneId.of("Asia/Seoul")); 
        // ZonedDateTime클래스의 of메서드의 매개변수는 (LocalDate, LocalTime, ZoneId)임. 즉 LocalDate와 LocalTime을 따로 받아야함
        
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London")); 
        // withZoneSameInstant(zoneId): 객체의 지역 표준 시간대를 매개변수(지역 표준 시간대)로 바꿈
        // 시간대만 유럽으로 바꿈
        
        ZonedDateTime nyTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York")); 
        // 시간대만 미국으로 바꿈
        
        System.out.println("서울의 회의 시간: " + seoulTime);
        System.out.println("런던의 회의 시간: " + londonTime);
        System.out.println("뉴욕의 회의 시간: " + nyTime);
    }
}

