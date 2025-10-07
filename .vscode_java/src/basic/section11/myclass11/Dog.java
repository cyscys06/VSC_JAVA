package section11.myclass11;

public class Dog extends AbstractAnimal 
{
    @Override
    public void sound() // 추상화 메서드였으므로(부모클래스에서), 오버라이딩하기
    {
        System.out.println("멍멍");
    }
}
