package section5.myclass5;

public class MemberConstruct 
{
    public String name;
    public int age;
    public int grade;
    
    public MemberConstruct(String name, int age) 
    {
        this(name, age, 50); // this()를 사용해 중복 코드 없애기
    }

    public MemberConstruct(String name, int age, int grade) 
    {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}