package basic.section2.practice2;
import basic.section2.myclass2.Student;

public class practice2_3 
{
    public static void main(String[] args)
    {
        Student student1; // 새로 만들 객체의 이름을 student1로 함 
        student1 = new Student(); // student1(사용할 객체 이름)에 Student 객체를, Student() 생성자를 사용하여 실제로 할당함

        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 90;

        Student student2; 
        student2 = new Student(); 

        student2.name = "학생2";
        student2.age = 15;
        student2.grade = 80;

        System.out.println(student1); // student1에 대한 정보를 출력 -> myclass.Student@주소(myclass파일에 있는 Student라는 클래스를 기반으로 한 객체이고, 주소는 뭐시기임)
        
        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);   
    }
}

// 하나의 패키지(폴더) 안에서 클래스만 초기화한 파일을 따로 만들어 놓고, 다른 파일에서 그 선언한 클래스를 인용하여 객체를 만들 수 있음
// 하지만 앞서 말한 경우는 같은 패키지 안에서만 해당하며, 다른 패키지의 클래스를 사용할 경우에는 import 클래스이름; 을 사용하여 다른 패키지에 있는 클래스를 불러와 사용할 수 있음
