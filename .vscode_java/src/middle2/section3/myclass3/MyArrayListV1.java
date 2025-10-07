package middle2.section3.myclass3;

import java.util.Arrays;

public class MyArrayListV1 
{
    private static final int DEFAULT_CAPACITY = 5; // 리스트 기본 크기
    private Object[] elementData; // 여러 타입의 데이터 보관D을 위해 Object배열 사용
    private int size = 0;
    
    public MyArrayListV1() 
    {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    
    public MyArrayListV1(int initialCapacity) 
    {
        elementData = new Object[initialCapacity];
    }
    
    public int size() // 리스트 크기 = 리스트 원소 개수 != 배열 크기 
    {
        return size;
    }
    
    public void add(Object e) // 리스트에 원소 추가
    {
        elementData[size] = e;
        size++;
    }
    
    public Object get(int index) // index 인덱스에 있는 값 반환
    {
        return elementData[index];
    }
    
    public Object set(int index, Object element) // index 인덱스의 값을 element로 변경
    {
        Object oldValue = get(index);
        elementData[index] = element;
        
        return oldValue;
    }
    
    public int indexOf(Object o) 
    // 매개변수와 같은 값이 있으면 그 값의 인덱스 반환
    // 없으면 -1 반환
    {
        for (int i = 0; i < size; i++) 
        {
            if (o.equals(elementData[i])) 
            {
                return i;
            }
        }
            
        return -1;
    }
    
    @Override
    public String toString() // size(리스트 원소개수)만큼의 배열 새로 만듦
    {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" + size + ", capacity=" + elementData.length;
    }    
}
