package middle1.section5.problem5;

import java.util.Scanner;

import middle1.section5.myclass5.HttpStatus;

public class problem5_3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("HTTP CODE: ");
        int httpCodeInput = sc.nextInt();
        
        HttpStatus status = HttpStatus.findByCode(httpCodeInput);
        
        if (status == null) 
        {
            System.out.println("정의되지 않은 코드");
        } 
        else 
        {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        }

        sc.close();
    }
}
