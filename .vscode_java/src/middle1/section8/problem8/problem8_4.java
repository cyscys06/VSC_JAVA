package middle1.section8.problem8;

import middle1.section8.myclass8.Hello;

public class problem8_4 
{
    public static void main(String[] args)
    {
        Hello h = new Hello() // 익명 클래스 생성: 
        {
            @Override
            public void hello()
            {
                System.out.println("Hello.hello");
            }
        };

        h.hello();
    }    
}
