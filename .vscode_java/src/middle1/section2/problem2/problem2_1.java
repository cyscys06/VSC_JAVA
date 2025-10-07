package middle1.section2.problem2;

import middle1.section1.myclass1.ImmutableMyDate;

public class problem2_1 
{
    public static void main(String[] args) 
    {
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1);
        ImmutableMyDate date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        
        System.out.println("2025 -> date1");
        date1 = date1.changeYear(2025); // date1의 년도를 변경하여 새로 만든 객체의 참조값을 date1에 다시 할당
        // changeYear가 ImmutableMyDate의 메서드이므로 .으로 연결해서 호출해야 함
        
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
