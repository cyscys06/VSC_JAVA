package basic.section3.practice3;
public class practice3_3 
{
    public static void main(String[] args) 
    {
        int a = 10; // a라는 이름의 int형 메모리에 10이라는 값이 할당
        
        System.out.println("메서드 호출 전: a = " + a); // 10 출력
        
        changePrimitive(a); // 매개변수 x에 a의 값 10을 복사
        
        System.out.println("메서드 호출 후: a = " + a); // a의 값에는 변화가 없으므로 똑같이 10이 출력됨
    }
    
    static void changePrimitive(int x) // 현재 x = 10이라는 값을 가지고 있을 것
    {
        x = 20; // x의 값에 20을 복사 -> x = 20
                // 하지만 원본 a의 값에 20을 복사한게 아니라 x에만 20을 복사한 것이므로 인자로써 매개변수 x에 값을 전달했던 a에는 변화가 없음, 즉 a = 10
                // c++ 하면서 함수쓸때는 값의 변화가 아닌 매개변수를 이용한 값 계산만 중심으로 했으므로 까먹을 수도 있지만,
                // 중요한건 함수 속의 매개변수의 변화가 곧 원본 값의 변화가 아닌 것을 반드시 기억해야 함
    }
}
