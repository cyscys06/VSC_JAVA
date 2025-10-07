package middle1.section3.problem3;

public class problem3_10 
{
    public static void main(String[] args) 
    {
        String fruits = "apple,banana,mango";

        String[] arr = fruits.split(",");

        String Fruits = String.join("->", arr);
        // String 클래스의 메서드 join(): 분할된 문자열 배열(2번째 매개변수)를 
        // 구분자(1번째 매개변수)로 다시 이어 붙임

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println(Fruits);

    }
}
