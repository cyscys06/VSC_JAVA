package basic.section6.practice6; // 이 파일이 어디 패키지(폴더)에 속해있는지를 경로로 나타낸 것
// 이 파일은 현재 section6 패키지 안의 practice6 패키지에 들어있음

import basic.section6.myclass6.Data;
// 한번에 여러 개의 클래스를 import 해올수도 있음

public class practice6_1 
{
    public static void main(String[] args) 
    {
        Data data = new Data();
        basic.section6.myclass6.User user = new basic.section6.myclass6.User();
        // User 클래스 파일의 전체 파일 경로

        System.out.println(data);
        System.out.println(user);
    }
}