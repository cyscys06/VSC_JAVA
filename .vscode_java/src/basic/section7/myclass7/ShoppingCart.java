package section7.myclass7;

public class ShoppingCart 
{
    private Item[] items = new Item[10]; // 카트에 담은 상품의 정보를 저장하는 배열
    private int count = 0; // 카트에 담은 상품 개수

    public void addItem(Item i)
    {
        if (count >= items.length)
        {
            System.out.println("장바구니가 가득 찼습니다.");
            return; // 구문 하나 실행했으면 바로 종료하기
        }
        else
        {
            items[count] = i;

            count++;
        }
    }

    public void displayItems()
    {
        for (int i = 0; i < count; i++)
        // 범위를 count까지로 한 이유: 범위를 배열의 크기만큼으로 지정하게 되면,
        // 위에서 미리 지정해놓은 배열의 크기 10이 범위가 되고, for문이 10번 돌게 됨
        // 하지만 상품정보가 반드시 10개 입력되는게 아니므로 10개보다 적은 값이 저장되면 
        // for문에서 상품이 저장되지 않은 인덱스를 돌때 items에서 null이 떠서 오류 남
        {
            System.out.println("상품명:" + items[i].getName() + ", 합계:" + items[i].getTotalPrice());
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }
    
    private int calculateTotalPrice()
    {
        int totalprice = 0;
        for (int i = 0; i < count; i++)
        {
            totalprice += items[i].getTotalPrice(); // 배열의 상품별 금액을 합쳐 총 합계 금액 산정 
        }
        
        return totalprice;
    }
}

