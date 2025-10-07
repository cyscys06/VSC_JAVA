package middle2.section5.myclass5;

public interface MyList<E> 
{
    int size();
    
    void add(E e);
    
    void add(int index, E e);
    
    E get(int index);
    
    E set(int index, E element);
    
    E remove(int index);
    
    int indexOf(E o);
    // 공통 인덱스들은 인터페이스로 추상화해놓기
}