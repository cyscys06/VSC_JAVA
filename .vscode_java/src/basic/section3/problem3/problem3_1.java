package section3.problem3;

import section3.myclass3.ProductOrder;

public class problem3_1 
{
    public static void main(String[] args)
    {
        ProductOrder product1 = createOrder("두부", 2000, 2);
        ProductOrder product2 = createOrder("김치", 5000, 1);
        ProductOrder product3 = createOrder("콜라", 1500, 2);

        ProductOrder[] products = {product1, product2, product3};

        printOrders(products);

        int totalAmount = getTotalAmount(products);
        System.out.println(totalAmount);
    }   
    
    static ProductOrder createOrder(String productName, int price, int quantity)
    {
        ProductOrder product = new ProductOrder();
        
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;

        return product;
    }

    static void printOrders(ProductOrder[] orders)
    {
        for (ProductOrder p : orders)
        {
            System.out.println("상품명: " + p.productName + " 가격: " + p.price + " 수량: " + p.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders)
    {
        int total = 0;

        for (ProductOrder p : orders)
        {
            total += p.quantity * p.price;
        }

        return total;
    }
}
