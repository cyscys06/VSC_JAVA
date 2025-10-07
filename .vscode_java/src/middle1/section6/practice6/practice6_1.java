package middle1.section6.practice6;

import java.time.LocalDate;

public class practice6_1 
{
    public static void main(String[] args) 
    {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        
        System.out.println("오늘 날짜 = " + nowDate); // now(): 현재시각 반환
        System.out.println("지정 날짜 = " + ofDate); // of(년, 월, 일): 사용자가 지정한 시각 반환
        
        //계산(불변)
        LocalDate plusDays = ofDate.plusDays(10); // plusXxx(): 일, 월, 년에 각각 숫자 더하기 가능
        System.out.println("지정 날짜+10d = " + plusDays);
    }
}
