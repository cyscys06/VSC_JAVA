package middle1.section6.problem6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class problem6_6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();

        printCalendar(year, month);
        sc.close();
    }
        
    public static void printCalendar(int year, int month) 
    {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1); // 입력받은 년, 월의 첫번째 일수
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1); // 다음달의 첫번째 일수
        
        // 일월화수목금토: 일수를 7로 나눈 나머지가 0, 1, 2, 3, 4, 5, 6
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7; 
        // 시작일의 요일 기준만큼 띄어쓰기용
        // getValue(): 열거형인 요일의 정수 값을 반환(1~7)

        System.out.println("Su Mo Tu We Th Fr Sa ");
        
        for (int i = 0; i < offsetWeekDays; i++) // 오프셋만큼 띄어쓰기하고 시작
        {
            System.out.print(" ");
        }
        
        LocalDate dayIterator = firstDayOfMonth; // 달의 첫일을 이터레이터로 지정
        
        while (dayIterator.isBefore(firstDayOfNextMonth)) // 이터레이터가 다음달의 첫일이 되기 전까지 반복
        {
            System.out.printf("%2d ", dayIterator.getDayOfMonth()); // printf로 출력 간격 지정
            
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) // 달력기준 1주의 마지막 요일인 토요일이 됐을때
            {
                System.out.println(); // 줄바꿈
            }
            
            dayIterator = dayIterator.plusDays(1); // 이터레이터 1 증가
        }
    }
}