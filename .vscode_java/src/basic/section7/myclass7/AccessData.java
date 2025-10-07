package basic.section7.myclass7;

public class AccessData 
{
    public int publicField; // 모든 외부에서 접근 가능
    int defaultField; // 같은 패키지에서만 접근 가능
    private int privateField; // 같은 클래스에서만 접근 가능

    public void publicMethod() 
    {
        System.out.println("publicMethod 호출 "+ publicField);
    }
    
    void defaultMethod() 
    {
        System.out.println("defaultMethod 호출 " + defaultField);
        // 같은 패키지에 속하므로 가능함
    }
    
    private void privateMethod() 
    {
        System.out.println("privateMethod 호출 " + privateField); 
        // 같은 클래스 메서드이므로 가능함
    }
    
    public void innerAccess() 
    {
        System.out.println("내부 호출");

        publicField = 100;
        defaultField = 200;
        privateField = 300;

        publicMethod();
        defaultMethod();
        privateMethod();
    }
}