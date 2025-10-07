package middle1.section5.problem5;

import java.util.Scanner;

import middle1.section5.myclass5.AuthGrade;

public class problem5_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String grade;

        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]:");
        grade = sc.nextLine();

        // 사용자의 입력을 통해 등급을 할당
        // valueOf(): 매개변수 문자열과 비교해서 일치하는 enum 상수를 반환
        // 비교할수 있게 입력값을 모두 대문자로 변환
        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase()); 

        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다");
        System.out.println("== 메뉴 목록 == ");
        System.out.println("- 메인 화면");

        if (authGrade.getLevel() > 1)
        {
            System.out.println("- 이메일 관리 화면");
        }

        if (authGrade.getLevel() > 2)
        {
            System.out.println("- 관리자 화면");
        }

        sc.close();
    }
}
