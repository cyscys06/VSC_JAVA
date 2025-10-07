package middle2.section4.myclass4;

public class Node 
{
    Object item; // 노드 값에는 다른 클래스 멤버 값이 들어올 수도 있음
    Node next; // 다음 노드를 가리키는 next

    

    public Node(Object item)
    {
        this.item = item;
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        
        while (x != null) 
        {
            sb.append(x.item);
            
            if (x.next != null) 
            {
                sb.append("->");
            }
            
            x = x.next;
        }
        
        sb.append("]");
        return sb.toString();
    }
}
