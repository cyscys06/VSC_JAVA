package middle1.section3.problem3;

public class problem3_1 
{  
    public static void main(String[] args) 
    {
        String url = "https://www.example.com";

        boolean flag = url.startsWith("https://"); 
        // url 객체의 문자열이 https://로 시작하면 true, 아니면 false
        // 메서드는 객체에 . 붙여서 써야한다는걸 반드시 기억해

        System.out.println(flag);
    }
}
