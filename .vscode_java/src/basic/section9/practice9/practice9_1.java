package basic.section9.practice9;

import basic.section9.myclass9.Data;

public class practice9_1 
{
    public static void main(String[] args) 
    {
        final Data data1 = new Data();
        //data = new Data(); //final 변경 불가 컴파일 오류
        
        //참조 대상의 값은 변경 가능
        data1.value = 10; // 객체의 인스턴스 변수 자체의 값을 10으로 수정(가능)
        System.out.println(data1.value);

        data1.value = 20; // 객체의 인스턴스 변수 자체의 값을 20으로 수정(가능)
        System.out.println(data1.value);

        Data data2 = new Data();
        data2 = data1; // data1

        System.out.println(data1);
        System.out.println(data2);
    }
}

// 출력값
// 10
// 20
// section9.myclass9.Data@19e1023e
// section9.myclass9.Data@19e1023e -> data1이 final이지만 data2도 같은 메모리 영역을 참조 가능