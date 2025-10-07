package basic.section10.practice10;

import basic.section10.myclass10.Child1;

public class practice10_3 
{
    public static void main(String[] args) 
    {
        Child1 child = new Child1();
        child.call();
    }
}

// 출력값
// Parent.publicMethod
// Parent.protectedMethod 
// -> protected는 상속관계여서 접근가능, 나머지 둘은 다른 패키지고 다른 클래스여서 접근 불가능

// ==Parent 메서드 안==
// publicValue = 1
// protectedValue = 1
// defaultValue = 0
// privateValue = 0

// printParent 메서드가 public이어서 접근 가능, 
// 이 메서드를 통해 default와 private 값에 접근 가능
// Parent.defaultMethod
// Parent.privateMethod