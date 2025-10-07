package basic.section3.practice3;

import basic.section3.myclass3.BigData;

public class practice3_9 
{
    public static void main(String[] args) 
    {
        BigData bigData = new BigData();

        System.out.println("bigData.count=" + bigData.count); // 디폴트값 0 출력
        System.out.println("bigData.data=" + bigData.data); // bigData의 멤버변수인 data에는 현재 null이 디폴트로 설정돼 있음. null 출력
        
        System.out.println("bigData.data.value=" + bigData.data.value); // data.value는 곧 null.value와 같고, 
                                                                        // data가 null 인 상태에서 멤버 변수에 접근할 수 없으므로 NullPointerException 발생
    }
}