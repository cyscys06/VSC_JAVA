package middle1.section8.problem8;

import middle1.section8.myclass8.OuterClass2;

public class problem8_2 
{
    public static void main(String[] args) 
    {
        OuterClass2 o1 = new OuterClass2();
        OuterClass2.InnerClass o2 = o1.new InnerClass(); 
        // 바깥클래스.new 내부클래스() 로, 바깥 클래스 내부의 클래스 객체가 생성됨

        o2.hello();
    }
}
