package middle2.section2.myclass2;

public class UnitPrinter 
{
    public static <T extends BioUnit> void printV1(Shuttle<T> u)
    {
        BioUnit unit = u.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }    

    public static void printV2(Shuttle<? extends BioUnit> u) 
    // 와일드카드 사용하려면, 타입 확정된 상태의 제네릭 타입 받아야 함
    {
        BioUnit unit = u.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
