package basic.section3.practice3;

import basic.section3.myclass3.Data;

public class practice3_2 
{
    public static void main(String[] args) 
    {
        Data dataA = new Data(); // 이 부분에서 dataA에 참조값이 할당됨
        dataA.value = 10; 
        Data dataB = dataA; // dataA의 참조값을 dataB에 복사(원본은 변화없음)

        System.out.println("dataA 참조값=" + dataA);
        System.out.println("dataB 참조값=" + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
        // 서로 다른 두 이름이 각각 같은 참조값을 가지므로 그 참조값을 통해 동일한 객체에 접근함

        dataA.value = 20; // dataA의 값을 변경하는게 아니라 dataA가 가리키는 객체의 값을 변경한것
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
        // dataB도 동일한 객체를 가리키므로 변경된 값을 출력함

        dataB.value = 30; // dataB의 값을 변경하는게 아니라 dataB가 가리키는 객체의 값을 변경한것
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
        // dataA도 동일한 객체를 가리키므로 변경된 값을 출력함
    }
}