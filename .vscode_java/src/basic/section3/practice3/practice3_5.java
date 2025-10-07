package basic.section3.practice3;

import basic.section3.myclass3.Student;

public class practice3_5 
{
    public static void main(String[] args) 
    {
        Student student1 = new Student(); // Student 객체 메모리의 참조값을 student1에 복사
        initStudent(student1, "학생1", 15, 90); // 메서드를 통해 매개변수로 받은 값들을 멤버 변수 값에 넣음

        Student student2 = new Student(); // Student 객체 메모리의 참조값을 student2에 복사
        initStudent(student2, "학생2", 16, 80); // 메서드를 통해 매개변수로 받은 값들을 멤버 변수 값에 넣음
        // 이때 student1, student2는 서로 다른 참조값을 가리킴

        printStudent(student1);
        printStudent(student2);
        // 서로 다른 참조값이 함수에 들어갔으므로, 각각 그 참조값에 대응하는 객체 메모리 속 멤버 변수들이 출력될 것
    }

    static void initStudent(Student student, String name, int age, int grade) 
    // Student형 객체의 참조값을 받고, 뒤에 오는 인자들을 참조값으로 접근한 객체 메모리의 멤버 변수 값에 복사하는 함수
    {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    
    static void printStudent(Student student1) 
    // Student형 객체의 참조값을 받아서, 참조값으로 접근한 객체 메모리의 멤버 변수들을 출력하는 함수
    {
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + "성적:" + student1.grade);
    }
}

// static: 클래스에 단 하나만 존재하고 객체가 아닌, 클래스 자체에 귀속되는 멤버 키워드.
// 객체를 여러 개 만들어도 static은 애초에 클래스에 귀속된 것이기 때문에 static 값은 하나만 존재함.
// 객체를 생성할 때마다 객체의 멤버 변수가 그 객체에 대해 만들어지는 것과 달리 static 키워드가 붙은 멤버 변수는 메모리에도 딱 한번만 올라감
// 위의 메서드들에 static이 붙은 것은 저 메서드들이 main이라는 메서드에 하나만 존재하는 것을 의미함(main은 파일에 대응되는 클래스의 static 메서드임).
// 블록(중괄호)에 사용하면 클래스가 처음 메모리에 할당될 때 단 한번만 실행되는 코드 블록이 됨.

