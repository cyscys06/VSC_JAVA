package basic.section2.problem2;
import basic.section2.myclass2.ProductOrder;

public class problem2_2 
{
    public static void main(String[] args)
    {
        ProductOrder good1 = new ProductOrder();
        good1.productName = "두부";
        good1.price = 2000;
        good1.quantity = 2;

        ProductOrder good2 = new ProductOrder();
        good2.productName = "김치";
        good2.price = 5000;
        good2.quantity = 1;

        ProductOrder good3 = new ProductOrder();
        good3.productName = "콜라";
        good3.price = 1500;
        good3.quantity = 2;

        int total = 0;

        ProductOrder[] goods = new ProductOrder[]{good1, good2, good3};

        for (ProductOrder g : goods)
        {
            System.out.println("상품명: " + g.productName + ", 가격: " + g.price + ", 수량: " + g.quantity);
            total += g.price * g.quantity;
        }

        System.out.println("총 결제 금액: " + total);
    }    
}
