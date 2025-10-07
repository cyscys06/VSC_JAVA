package middle1.section6.problem6;

import java.time.LocalDate;

public class problem6_2 
{
    public static void main(String[] args)
    {
        LocalDate localDate = LocalDate.of(2024, 1, 1);

        for (int i = 01; i <= 5; i++)
        {
            System.out.println("날짜 " + i + ": " + localDate);
            localDate = localDate.plusWeeks(2);
        }
    }    
}
