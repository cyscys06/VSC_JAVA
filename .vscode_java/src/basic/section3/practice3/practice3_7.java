package basic.section3.practice3;

import basic.section3.myclass3.Data;

public class practice3_7 
{
public static void main(String[] args) 
    {
        Data data = null; // null을 data 변수에 복사
       
        System.out.println("1. data = " + data); // null이 출력
        
        data = new Data(); // 새로운 객체의 참조값을 data에 복사
        System.out.println("2. data = " + data); // 새로운 객체의 주소가 출력
        
        data = null; // 다시 null을 data에 복사
        System.out.println("3. data = " + data); // null 출력
        
        // 이때 새로 만든 객체를 어떤 변수도 참조하지 있지 않으므로 GC가 그 객체를 제거할 것임
    }
}