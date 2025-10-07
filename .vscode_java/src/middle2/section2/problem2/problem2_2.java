package middle2.section2.problem2;

import middle2.section2.myclass2.Marine;
import middle2.section2.myclass2.Shuttle;
import middle2.section2.myclass2.Zealot;
import middle2.section2.myclass2.Zergling;

public class problem2_2 
{
    public static void main(String[] args) 
    {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));
        shuttle1.showInfo();
        
        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 35));
        shuttle2.showInfo();
        
        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot("질럿", 100));
        shuttle3.showInfo();
    }    
}
