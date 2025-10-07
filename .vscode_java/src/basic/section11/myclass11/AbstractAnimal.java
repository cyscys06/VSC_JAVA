package basic.section11.myclass11;

public abstract class AbstractAnimal 
{
    
    public abstract void sound(); // 메서드 추상화: 자식 클래스에서 오버라이딩할 메서드
    
    public void move() // 추상화 아닌 메서드
    {
        System.out.println("동물이 이동합니다.");
    }
}