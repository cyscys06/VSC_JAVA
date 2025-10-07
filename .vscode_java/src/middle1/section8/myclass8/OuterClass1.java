package middle1.section8.myclass8;

public class OuterClass1 
{
    public static class NestedClass 
    // 접근제어자 설정 안하면 default인데, 
    // 다른 패키지라 접근 안되므로 public 꼭 해주기
    {
        public void hello()
        {
            System.out.println("NestedClass.hello");
        }
    }
}
