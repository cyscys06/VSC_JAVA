package section10.myclass10;

public class ClassC extends ClassB
{
    public ClassC()
    {
        super(10, 20); // 여기서의 super()는 클래스C의 부모인 클래스B를 의미하고, 
                           // 클래스 B에서 기본 생성자가 존재하지 않았으므로 super() 매개변수에 값을 넣는다
        System.out.println("ClassC 생성자");
    }
}
