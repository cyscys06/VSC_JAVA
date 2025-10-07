package basic.section2.practice2;
import basic.section2.myclass2.Student;

public class practice2_4 
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
        // 학생 1, 2에 대한 객체를 생성한 후

        Student[] students = new Student[2]; // Student 클래스 형의 객체들을 담을 배열 이름을 students라 하고, 
                                             // 새로운 메모리에 크기가 2인 Student형 배열을 생성하여 그 배열의 참조값(주소)를 students라는 변수에 담는 것이다.
        students[0] = student1;
        students[1] = student2;
        // students 배열의 인덱스 값에 각각 학생1, 2 객체를 담음
        // 이때 담아지는 값은 객체 전체가 통째로 복사돼서 담아지는게 아니라 객체의 이름(즉 참조값(주소))만 인덱스값에 담아지는 것이다.
        // 따라서 배열의 인덱스 값 안에는 각각의 객체에 해당하는 참조값만 들어있으며, 
        // 후에 객체에 대한 정보를 출력할 때 인덱스 값에 복사된 참조값으로 원본 객체에 접근하여 정보를 출력하는 것이다.
        // 중요: 자바에서 '='는 항상 변수에 들어있는 값만 복사해서 전달하는 것이다.
        // 이로써 students 배열에서는 학생1, 학생2 객체에 접근 가능함
        
        // 방법1
        for (int i = 0; i < students.length; i++)
        {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }

        // 방법2
        for (int i = 0; i < students.length; i++)
        {
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

        // 방법3
        for (Student s : students)
        {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

    }

    
}
