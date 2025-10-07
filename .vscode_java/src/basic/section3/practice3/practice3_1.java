package basic.section3.practice3;
public class practice3_1 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = a; // 변수 b에 변수 a의 값인 10만 복사되어 들어감(원본 a = 10에는 변화 없음)
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        a = 20; // 원본 a의 값을 20변경(당연히 변수 b는 변화 없음)
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 30; // 원본 b의 값을 30으로 변경(당연히 변수 a는 변화 없음)
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}