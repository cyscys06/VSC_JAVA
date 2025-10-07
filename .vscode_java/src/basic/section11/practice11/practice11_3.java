package basic.section11.practice11;

import basic.section11.myclass11.*;

public class practice11_3 
{
    public static void main(String[] args) 
    {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1); // parent1은 Parent 타입의 인스턴스를 참조하고 있으므로 false

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2); // parent2가 Child 타입의 인스턴스를 참조하고 있으므로 true
    }

    private static void call(Parent parent) 
    {
        parent.parentMethod();
        if (parent instanceof Child) // 인자로 받은 객체가 어떤 클래스의 인스턴스를 참조하고 있는지 검사
        // Child는 자식 클래스가 없으므로 특수경우 해당 X
        {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}