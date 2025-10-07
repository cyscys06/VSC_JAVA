package basic.section8.practice8;

public class practice8_1 
{
    public static void main(String[] args) 
    {
        System.out.println("main start");

        method1(10); // 메서드1이 첫번째로 스택에 들어감
        
        System.out.println("main end");
    }

    static void method1(int m1) 
    {
        System.out.println("method1 start");
        
        int cal = m1 * 2;
        method2(cal); // 메서드1 실행 도중 메서드2를 만나서 스택에 메서드2를 넣음
                      // -> 메서드2를 먼저 종료시키고, 그 후에 메서드1이 종료됨
        
        System.out.println("method1 end");
    }

    static void method2(int m2) 
    {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}

// 출력값
// main start
// method1 start
// method2 start -> 메서드2가 나중에 들어가서
// method2 end -> 메서드2가 먼저 종료됨
// method1 end
// main end