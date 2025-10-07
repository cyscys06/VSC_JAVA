package middle2.section1.myclass1;

public class Pair<T1 ,T2> 
{
    private T1 first;
    private T2 second;

    public void setFirst(T1 f)
    {
        first = f;
    }

    public void setSecond(T2 s)
    {
        second = s;
    }

    public T1 getFirst()
    {
        return first;
    }

    public T2 getSecond()
    {
        return second;
    }

    @Override 
    public String toString()
    {
        return "Pair{first=" + first + ", second=" + second + "}";
    }
    // toString(): Object 클래스의 하위 메서드 -> 객체의 필드값들을 문자열 형태로 반환하는 메서드
    // Pair 클래스의 필드 값인 first와 second를 사용할 수 있고, 이 필드 값들은 문자열 형태로 반환됨
    // Object 클래스의 하위 클래스인 객체의 이름만 써도 toString()이 자동으로 호출됨
    // System.out.println() 메서드는 사실 내부에서 toString() 을 호출하는 원리이므로
    // System.out.println()이랑 toString이랑 객체를 호출한 결과는 같음  
}
