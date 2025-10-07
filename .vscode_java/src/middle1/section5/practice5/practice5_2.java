package middle1.section5.practice5;

import middle1.section5.myclass5.Grade;

public class practice5_2 
{
    public static void main(String[] args) 
    {
        int price = 10000;

        Grade[] grades = Grade.values();

        for (Grade g : grades)
        {
            printDiscount(g, price);
        }
    }    

    // 등급과 원 가격 받아서 할인금액 출력하는 메서드
    // 열거 클래스에서 자체적으로 호출할수 있게 변경
    public static void printDiscount(Grade g, int p)
    {
        System.out.println(g.name() + " 등급의 할인 금액: " + g.discount(p));
    }
}
