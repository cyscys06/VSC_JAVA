package section8.problem8;

import static section8.myclass8.MathArrayUtils.*; 
// 사용할 클래스의 정적 메서드와 변수만 불러왔으므로, 
// 인스턴스 메서드 중 public에 있는 기본 생성자는 불러와지지 않았음.
// 따라서 객체를 생성하려 해도 오류가 발생할 것

public class problem8_2 
{
    public static void main(String[] args)
    {
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("sum=" + sum(values));
        System.out.println("average=" + average(values));
        System.out.println("min=" + min(values));
        System.out.println("max=" + max(values));
    }
}
