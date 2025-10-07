# 변수와 초기화

## 멤버 변수 
클래스 안에서 선언된 변수를 뜻한다.
멤버 변수는 사용자가 직접 초기화하지 않아도 알아서 디폴트값을 사용해 멤버 변수를 초기화시킨다.<br>
ex) 숫자( `int` )= `0` , `boolean` = `false` , 참조형 = `null` ( `null` 값은 참조할 대상이 없다는 뜻으로 사용된다.)


## 지역 변수
메서드(함수) 안에서 선언된 변수를 뜻한다. 메서드의 매개 변수도 지역 변수에 포함된다.<br>
지역 변수는 특정 메서드 안에서만 사용되는 변수를 뜻한다. 지역 변수가 속한 메서드가 종료되어 소멸하면 지역 변수 또한 메서드를 따라 같이 소멸한다.<br>
지역 변수는 항상 사용자가 직접 초기화 해줘야 한다.

## 예시

ex) public class Student 
    {
        String name;
        int age;
        int grade;
    }
    여기에서 name, age, grade는 Student 클래스의 멤버 변수이다(클래스 안에서 새로 선언됐으므로).

ex) public class ClassStart3 
    {
        public static void main(String[] args) 
        {
            Student student1;
            student1 = new Student();
            Student student2 = new Student();
        }
    }
    여기에서 student1, student2는 main 메서드의 지역 변수이다.

public class MethodChange1 
{
    public static void main(String[] args) 
    {
        int a = 10;

        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
    }
    
    public static void changePrimitive(int x) 
    {
        x = 20;
    }
}
여기에서 a는 main() 메서드의 지역 변수이고, x 또한 changePrimitive()의 매개 변수이므로 지역 변수이다.



# null
`null` 은 값이 존재하지 않는, 없다는 뜻이다.<br>
참조형 변수에서 아직 가리키는 대상이 없다면 `null` 이라는 특별한 값을 넣어둘 수 있다.<br>
만약 최종적으로 프로그램을 실행했을때도 어떤 객체를 참조하는 변수가 없어서 현재 짜놓은 코드에서는 그 객체에 접근할 방법이 없을 때, <br>
그 객체를 GC(가비지 컬렉션)이 자동으로 메모리 공간에서 제거하여 사용자가 일일히 메모리가 할당된 객체를 제거하는 코드를 짜지 않아도 되게 한다.<br><br>

정리하면 어떤 객체를 참조하는 변수가 하나라도 있으면 그 객체는 사라지지 않지만, 어떤 변수도 그 객체를 참조하지 않으면 GC가 자동으로 그 객체를 제거한다.

# NullPointerException
주소가 없는 곳, 즉 null을 찾아갈 때 발생하는 예외이다.<br>
객체를 참조할 때는 `.` (dot)을 사용하여 객체를 참조할 수 있다. <br>
하지만 참조값이 `null` 이라면 값이 없다는 뜻이므로, 찾아갈 수 있는 객체(인스턴스)가 없다. <br>
`NullPointerException` 은 이처럼 `null` 에 `.` (dot)을 찍었을 때 발생한다.