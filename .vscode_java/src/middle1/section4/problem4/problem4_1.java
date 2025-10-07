package middle1.section4.problem4;

public class problem4_1 
{
    public static void main(String[] args)
    {
        String str1 = "10";
        String str2 = "20";

        Integer num1 = Integer.parseInt(str1); 
        Integer num2 = Integer.parseInt(str2);
        // Integer 클래스의 메서드 parseInt()를 이용해
        // 문자열을 정수로 변경

        Integer num3 = num1 + num2;
        System.out.println("두 수의 합: " + num3);
    }
}
