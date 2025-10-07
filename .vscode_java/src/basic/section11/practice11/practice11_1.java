package section11.practice11;

import section11.myclass11.*;

public class practice11_1 
{
    public static void main(String[] args)
    {
        // 부모 변수가 부모 인스턴스 생성자 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();
        
        // 자식 변수가 자식 인스턴스 생성자 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod(); // 상속받았으므로 가능
        child.childMethod();
        
        // 부모 변수가 자식 인스턴스 생성자 참조 -> 다형적 참조 특성으로 인해 가능
        // 부모 클래스는 본인을 포함한 모든 하위 클래스에 개입할 수 있음
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
    
        // Child child1 = new Parent(); 자식은 부모를 담을 수 없다.
        // 부모 클래스에서 자식 클래스로 내려갈 수 없으므로 자식의 기능은 호출할 수 없다.
        // poly.childMethod();
    }    
}
