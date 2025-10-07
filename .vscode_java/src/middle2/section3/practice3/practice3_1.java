package middle2.section3.practice3;

import java.util.Arrays;

public class practice3_1 
{
    public static void main(String[] args) 
    {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        
        System.out.println("기본 상태:");
        System.out.println(Arrays.toString(arr));
        
        //배열의 첫번째 위치에 추가
        //기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫번째 위치에 추가
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));
        
        //index 위치에 추가
        //기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 index 위치에 추가
        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));
        
        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
    }
        
    private static void addLast(int[] arr, int newValue) // 배열 마지막에 넣기 
    {
        arr[arr.length - 1] = newValue; 
    }
        
    private static void addFirst(int[] arr, int newValue) // 배열 첫번째에 넣기
    {
        for (int i = arr.length - 1; i > 0; i--) 
        {
            arr[i] = arr[i - 1]; // 현재 인덱스의 바로 왼쪽 인덱스의 값을 복사
        }
        
        arr[0] = newValue;
    }
        
    private static void addAtIndex(int[] arr, int index, int newValue) 
    {
        for (int i = arr.length - 1; i > index; i--) 
        // i가 index값보다 큰동안 반복(i보다 작아지면 사용자가 정한 중간 인덱스보다 더 왼쪽으로 가는게 됨)
        {
            arr[i] = arr[i - 1]; // 현재 인덱스의 바로 왼쪽 인덱스의 값을 복사
        }
        
        arr[index] = newValue;
    }    
}
