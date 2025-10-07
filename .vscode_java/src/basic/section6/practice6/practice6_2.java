package basic.section6.practice6;

import basic.section6.myclass6.*; // section6.myclass6 패키지 안에 있는 모든 클래스를 사용 가능하다.
public class practice6_2 
{
    public static void main(String[] args) 
    {
        Data data = new Data();
        User user = new User(); 
        //import 사용으로 인해 다른 패키지에 들어있는 클래스여도 파일 경로를 생략 가능하다.
        
        System.out.println(data);
        System.out.println(user);
    }
}