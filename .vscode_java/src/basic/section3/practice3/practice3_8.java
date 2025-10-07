package section3.practice3;

import section3.myclass3.Data;

public class practice3_8 
{
    public static void main(String[] args) 
    {
        Data data = new Data(); // null // null을 data에 복사

        data.value = 10; // 현재 data는 null이라는 값을 가리키고 있는데, 
                         // 이 상태에서는 data의 value라는 멤버 변수가 존재할 수 없으므로 NullPointerException 오류가 발생
        
        System.out.println("data = " + data.value); // 출력 불가능한 채로 에러 뜸
    }
}