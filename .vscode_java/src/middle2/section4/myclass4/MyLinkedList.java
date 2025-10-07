package middle2.section4.myclass4;

public class MyLinkedList 
{
    private Node first;
    private int size = 0; // 리스트 크기
    
    public void add(Object e)
    {
        Node newNode = new Node(e);
        if (first == null) // 리스트에 아무 노드도 없으면
        {
            first = newNode; // first에 추가
        }
        else // 뭐 있으면
        {
            Node lastNode = getLastNode();
            lastNode.next = newNode; // 마지막 노드 뒤에 추가
        }
        size++;
    }

    private Node getLastNode() // 리스트의 마지막 노드 반환
    {
        Node x = first;
        while (x.next != null)
        {
            x = x.next;
        }
        return x;
    }

    public void add(int index, Object e) 
    {
        Node newNode = new Node(e);
        if (index == 0) {
        newNode.next = first;
        first = newNode;
        } else {
        Node prev = getNode(index - 1);
        newNode.next = prev.next;
        prev.next = newNode;
        }
        size++;
    }

    public Object set(int index, Object element) 
    // 특정 인덱스의 노드의 값을 바꾸고 기존값 반환
    {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }
    
    public Object remove(int index) 
    {
        Node removeNode = getNode(index);
        
        Object removedItem = removeNode.item;
        
        if (index == 0) 
        {
            first = removeNode.next;
        } 
        else 
        {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        
            removeNode.item = null;
            removeNode.next = null;
            size--;
            return removedItem;
    }
    
    public Object get(int index) // 특정 인덱스의 노드의 값을 반환
    {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) // 특정 인덱스에 있는 노드를 반환
    {
        Node x = first;
        for (int i = 0; i < index; i++) 
        {
            x = x.next;
        }
        return x;
    }
    
    public int indexOf(Object o) 
    // 매개변수와 값이 같은 노드값을 가진 노드의 인덱스를 반환
    // 같은 값 가진 노드 없으면 -1 반환
    {
        int index = 0;
        for (Node x = first; x != null; x = x.next) 
        {
            if (o.equals(x.item)) // equals 메서드로 값이 같은지 비교
            {
                return index;
            }
            index++;
        }
        return -1;
    }
    
    public int size() // 리스트 크기 반환
    {
        return size;
    }
    
    @Override
    public String toString() // println속 toString 오버라이딩
    {
        return "MyLinkedListV1{" + "first=" + first + ", size=" + size + '}';
    }

    
}

