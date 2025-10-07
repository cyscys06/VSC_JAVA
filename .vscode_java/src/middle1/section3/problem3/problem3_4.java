package middle1.section3.problem3;

public class problem3_4 
{
    public static void main(String[] args) 
    {
        String str = "hello.txt";

        System.out.println(":filename = " + str.substring(0, 5)); // 시작인덱스 <= x < 끝인덱스(범위 조심할 것)
        System.out.println(":filename = " + str.substring(5, str.length()));
    }
}
