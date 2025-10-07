package basic.section10.myclass10;

public class Parent1 
{
    public int publicValue; // public: 모두 접근 가능
    protected int protectedValue; // protected: 다른 패키지여도 접근 가능, 상속관계 아니면 불가능
    int defaultValue; // default: 다른 패키지면 접근 불가능
    private int privateValue; // private: 같은 클래스 아니면 다 접근 불가능(자식 클래스여도)

    public void publicMethod() 
    {
        System.out.println("Parent.publicMethod");
    }
    
    protected void protectedMethod() 
    {
        System.out.println("Parent.protectedMethod");
    }
    
    void defaultMethod() 
    {
        System.out.println("Parent.defaultMethod");
    }
    
    private void privateMethod() 
    {
        System.out.println("Parent.privateMethod");
    }
    
    public void printParent() 
    {
        System.out.println("==Parent 메서드 안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue); 
        System.out.println("privateValue = " + privateValue); 
        
       
        defaultMethod();
        privateMethod();
    }
}