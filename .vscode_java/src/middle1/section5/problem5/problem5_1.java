package middle1.section5.problem5;

import middle1.section5.myclass5.AuthGrade;

public class problem5_1 
{
    public static void main(String[] args)
    {
        AuthGrade[] authgrades = AuthGrade.values();

        for (AuthGrade a : authgrades)
        {
            printInformation(a);
        }
    }
    
    public static void printInformation(AuthGrade a)
    {
        System.out.println("grade=" + a.name() + ", level=: " + a.getLevel() + ", 설명:" + a.getDescription());
    }
}
