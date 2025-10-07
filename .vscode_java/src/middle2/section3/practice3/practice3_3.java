package middle2.section3.practice3;

import middle2.section3.myclass3.MyArrayListV2;

public class practice3_3 
{
    public static void main(String[] args) 
    {
        MyArrayListV2 list = new MyArrayListV2(2);
        
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list); 
        list.add("c"); // 크기 증가
        System.out.println(list);
        list.add("d");
        System.out.println(list);
        list.add("e"); // 크기 증가
        System.out.println(list);
        list.add("f");
        System.out.println(list);
    }
}
