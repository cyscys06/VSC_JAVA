package basic.section8.myclass8;

public class DecoData 
{
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() 
    {
        //instanceValue++; // 정적 메서드에는 인스턴스 변수 접근 불가, compile error
        //instanceMethod(); //정적 메서드에는 인스턴스 메서드 접근 불가, compile error
        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
    }

    public void instanceCall() 
    {
        instanceValue++; // 인스턴스 변수 접근 가능
        instanceMethod(); // 인스턴스 메서드 접근 가능
        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
    }

    private void instanceMethod() 
    {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() 
    {
        System.out.println("staticValue=" + staticValue);
    }
}