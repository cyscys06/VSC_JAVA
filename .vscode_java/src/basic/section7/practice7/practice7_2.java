package section7.practice7;

import section7.myclass7.PublicClass;

public class practice7_2 
{
    public static void main(String[] args) 
    {
        PublicClass publicClass = new PublicClass();
        // public은 그냥 가능

        // DefaultClass1 class1 = new DefaultClass1();
        // DefaultClass2 class2 = new DefaultClass2();
        // dafault는 지금 다른 패키지여서 안됨

        System.out.println(publicClass);
    }
}