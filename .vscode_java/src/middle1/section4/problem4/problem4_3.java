package middle1.section4.problem4;

public class problem4_3 
{
    public static void main(String[] args)
    {
        String str = "100";
        
        Integer num1 = Integer.parseInt(str);
        // valueOf()가 문자열, 숫자 모두 지원하므로 valueOf() 써도 됨
        System.out.println("integer1 = " + num1);

        int num2 = num1.intValue(); // Integer 값을 int로 언박싱
        System.out.println("intValue = " + num2);

        Integer num3 = Integer.valueOf(num2); // int 값을 Integer로 박싱
        System.out.println("integer2 = " + num3);
    }    
}
