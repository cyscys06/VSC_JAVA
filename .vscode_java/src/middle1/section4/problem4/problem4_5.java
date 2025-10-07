package middle1.section4.problem4;

import java.util.Random;

public class problem4_5 
{
    public static void main(String[] args)
    {
        Random random = new Random();

        int arr[] = new int[6];
        
        for (int i : arr)
        {
            arr[i] = random.nextInt(45); 
            // 0부터 매개변수(45) 미만인 수를 랜덤으로 반환
            int num = arr[i] + 1; // 1부터 45를 범위로 해야하므로 1 더해주기
            System.out.print(num + " ");
        }

        
    }
    

    
}
