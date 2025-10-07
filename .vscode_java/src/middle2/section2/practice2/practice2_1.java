package middle2.section2.practice2;

import middle2.section2.myclass2.GenericMethod;

public class practice2_1 
{
    public static void main(String[] args)
    {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i); // 메서드에 Integer 인자를 전달
        Integer integerValue = GenericMethod.<Integer>numberMethod(10); // 메서드에 Integer 인자를 전달
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0); // 메서드에 Double 인자를 전달 
    
        System.out.println(result + integerValue + doubleValue);
        System.out.println(object);
    }    
}
