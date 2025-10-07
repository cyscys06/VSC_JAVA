package basic.section3.practice3;

import basic.section3.myclass3.Student;

public class practice3_6 
{
    public static void main(String[] args) 
    {
        Student student1 = createStudent("학생1", 15, 90); // createStudent 함수를 통해 만든 Student 객체 메모리의 반환값(참조값)을 student1에 복사 
        System.out.println("student1 = " + student1); // 복사한 참조갑을 출력(확인용)
        // 메서드 안에서 출력한 객체 메모리의 참조값과 이를 student1에 복사한 참조값이 같을 것
        
        Student student2 = createStudent("학생2", 16, 80); // createStudent 함수를 통해 만든 Student 객체 메모리의 반환값(참조값)을 student1에 복사 
        System.out.println("student2 = " + student2); // 복사한 참조갑을 출력(확인용)
        // 메서드 안에서 출력한 객체 메모리의 참조값과 이를 student2에 복사한 참조값이 같을 것

        printStudent(student1);
        printStudent(student2);
    }
    
    static Student createStudent(String name, int age, int grade) // Student형 객체를 반환하는, 정보를 받아 새로운 객체를 만드는 메서드
    {
        Student student = new Student(); // 메서드 안에서 새로운 Student형 메모리를 만들고 그 참조값을 student에 복사
        System.out.println("student1 = " + student); // 그 참조값을 출력

        // 인자로 받은 값들을 새로 만든 객체의 멤버 변수에 복사
        student.name = name;
        student.age = age;
        student.grade = grade;
        
        return student; // 메서드 안에서 만든 객체를 main() 메서드에서도 사용해야 하므로, 메서드 안에서 만든 student 객체의 참조값을 반환
    }
    
    static void printStudent(Student student1) // Student형 객체를 인자로 받아 그 객체의 정보를 출력하는 함수
    {
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + "성적:" + student1.grade);
    }
}
