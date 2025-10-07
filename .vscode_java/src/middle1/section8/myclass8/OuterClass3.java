package middle1.section8.myclass8;

public class OuterClass3 
{
    public void myMethod() // hello 호출해야함
    {
        class LocalClass // 지역 클래스는 접근제어자 사용 불가능
        {
            public void hello()
            {
                System.out.println("LocalClass.hello");
            }
        } 

        LocalClass l = new LocalClass();
        l.hello();
    }    
}
