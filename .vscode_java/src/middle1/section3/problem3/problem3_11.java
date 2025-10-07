package middle1.section3.problem3;

public class problem3_11 
{
    public static void main(String[] args) 
    {
        String str = "Hello Java";

        String reversed = new StringBuilder(str).reverse().toString();
        // StringBuilder 메서드로 str을 받고 
        // reverse() 메서드로 문자열을 뒤집은 후
        // toString() 메서드로 출력
        // 메서드 체이닝: 메서드들이 전부 자기 자신의 참조값을 반환하기 때문에 가능함 
        System.out.println(reversed);
    }  
}
