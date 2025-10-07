package middle1.section10.practice10;

import java.util.Scanner;

import middle1.section10.myclass10.NetworkClientExceptionV2;
import middle1.section10.myclass10.NetworkServiceV2_5;

public class practice10_1
{
    public static void main(String[] args) throws NetworkClientExceptionV2
    // sendMessage메서드에서 예외 전달받을때 main으로 바로 전달하므로 main도 예외 받을 수 있음을 선언해야 함
    // main까지 예외가 왔을때 main도 예외를 처리하는 기능이 없으므로 main또한 예외를 밖으로 던짐
    // main 밖으로 예외가 던져지면 예외 메시지와 예외를 추적할 수 있는 스택 트레이스를 출력하고 프로그램을 종료
    {
        NetworkServiceV2_5 networkService = new NetworkServiceV2_5();

        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.print("전송할 문자: ");

            String input = sc.nextLine();

            if (input.equals("exit"))
            {
                break;
            }

            networkService.sendMessage(input);
            System.out.println();
        }

        System.out.println("프로그램을 정상 종료합니다.");
        sc.close();
    }
}