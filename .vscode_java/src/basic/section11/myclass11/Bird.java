package section11.myclass11;

public class Bird extends AbstractAnimal implements Fly // 클래스는 상속, 인터페이스는 구현
{                                                       // 인터페이스는 다중 구현 가능해서 여러개 implements 가능함
    @Override                                           // 상속 구현 동시에 할때 extends가 먼저 나옴
    public void sound() 
    {
        System.out.println("짹짹");
    }
    
    @Override
    public void fly() 
    {
        System.out.println("새 날기");
    }
}
