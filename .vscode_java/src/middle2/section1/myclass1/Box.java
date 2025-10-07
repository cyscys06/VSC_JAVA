package middle2.section1.myclass1;

public class Box<T> 
{
    private T value; // T 타입의 밸류: 타입 T인 객체가 갖고있는 모든 필드값이 저장됨

    public void set(T v)
    {
        value = v;
    }

    public T get()
    {
        return value;
    }
    
}
