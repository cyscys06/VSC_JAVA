package section5.myclass5;

public class MemberInit 
{
    public String name;
    public int age;
    public int grade;

    public void initMember(String name, int age, int grade) 
    // 메서드의 매개변수 이름과 클래스 내부의 멤버 변수의 이름이 같은 상태
    {
        // 같은 이름의 데이터여도 this 키워드를 붙인 데이터는 클래스 내부 멤버 변수를 의미하는 것으로 바뀌었기 때문에
        // 이름이 같아도 구분이 가능하다. 
        this.name = name; // this 키워드가 없는 데이터는 메서드의 매개변수이다.
        this.age = age;
        this.grade = grade;
    }
}

