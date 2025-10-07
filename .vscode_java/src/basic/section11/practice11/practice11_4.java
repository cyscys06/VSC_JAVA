package basic.section11.practice11;

import basic.section11.myclass11.*;

public class practice11_4 
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);    
        // 매개변수가 AbstractAnimal 타입이므로 해당 클래스 가서 sound 메서드 찾고,  
        // sound가 추상 메서드이므로 현재 자식 클래스인 Dog로 가서 sound 찾음
        // Dog에 있는 sound 출력
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird);
        // sound랑 같은 로직
        flyAnimal(chicken);
    }    

private static void soundAnimal(AbstractAnimal animal) 

{
    System.out.println("동물 소리 테스트 시작");
    animal.sound();

    System.out.println("동물 소리 테스트 종료");
}

//Fly 인터페이스가 있으면 사용 가능
private static void flyAnimal(Fly fly) 
{
    System.out.println("날기 테스트 시작");
    fly.fly();
    System.out.println("날기 테스트 종료");
}

}