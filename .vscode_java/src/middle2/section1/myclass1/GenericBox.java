package middle2.section1.myclass1;

public class GenericBox<T> // GenericBox 클래스의 타입 매개변수 T
{
    private T value;

    public void set(T value) 
    {
        this.value = value;
    }
    
    public T get() 
    {
        return value;
    }

    // 입력받은 T의 타입에 따라 필드, 메서드의 매개변수 타입이 정해짐
}
