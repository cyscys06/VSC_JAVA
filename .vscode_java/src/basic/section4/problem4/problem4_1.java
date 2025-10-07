package basic.section4.problem4;

import basic.section4.myclass4.Rectangle;

public class problem4_1 
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        rectangle.area = rectangle.calculateArea(); 
        rectangle.perimeter = rectangle.calculatePerimeter();
        rectangle.square = rectangle.isSquare();

        System.out.println("넓이: " + rectangle.area);
        System.out.println("둘레 길이: " + rectangle.perimeter);
        System.out.println("정사각형 여부: " + rectangle.square);
    }
}
