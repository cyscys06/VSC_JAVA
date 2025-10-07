package middle2.section2.problem2;

import middle2.section2.myclass2.Marine;
import middle2.section2.myclass2.UnitUtil;
import middle2.section2.myclass2.Zealot;

public class problem2_1 
{
    public static void main(String[] args) 
    {
        Marine m1 = new Marine("마린1", 40);
        Marine m2 = new Marine("마린2", 50);
        
        Marine resultMarine = UnitUtil.maxHp(m1, m2); 
        // maxHp를 UnitUtil의 메서드로 선언했음(static)
        // UnitUtil객체를 만들어서 거기에 받은다음 resultMarine에 옮기거나
        // maxHp를 static으로 선언해야 함
        System.out.println("resultMarine = " + resultMarine);
        
        Zealot z1 = new Zealot("질럿1", 100);
        Zealot z2 = new Zealot("질럿2", 150);
        
        Zealot resultZealot = UnitUtil.maxHp(z1, z2);
        System.out.println("resultZealot = " + resultZealot);
    }    
}
