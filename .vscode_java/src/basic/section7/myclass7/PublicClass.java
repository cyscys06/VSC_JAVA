package section7.myclass7;

public class PublicClass 
{
    public static void main(String[] args) 
    {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();

        System.out.println(publicClass);
        System.out.println(class1);
        System.out.println(class2);
    }
}

class DefaultClass1 
{

}

class DefaultClass2 
{

}