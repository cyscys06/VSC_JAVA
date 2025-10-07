package middle1.section1.problem1;

import middle1.section2.myclass2.Rectangle;

public class problem1_1 
{
    public static void main(String[] args) 
    {
        Rectangle rect1 = new Rectangle(100, 20);
        Rectangle rect2 = new Rectangle(100, 20);

        System.out.println(rect1);
        System.out.println(rect2);

        System.out.println(rect1 == rect2);
        
        System.out.println(rect1.equals(rect2));
    }    
}
