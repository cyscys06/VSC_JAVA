package middle1.section6.practice6;

import java.time.LocalTime;

public class practice6_2 
{
    public static void main(String[] args) 
    {
        LocalTime nowTime = LocalTime.now(); // 현재시간
        LocalTime ofTime = LocalTime.of(9, 10, 30);
        
        System.out.println("현재 시간 = " + nowTime);
        System.out.println("지정 시간 = " + ofTime);
        
        //계산(불변)
        LocalTime ofTimePlus = ofTime.plusSeconds(30);
        System.out.println("지정 시간+30s = " + ofTimePlus);
    }    
}
