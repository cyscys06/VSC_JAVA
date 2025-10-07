package section3.problem3;

import java.util.Scanner;

import section3.myclass3.ProductOrder;

public class problem3_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // 입력을 받는 sc객체 생성

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int size = sc.nextInt(); // sc객체의 next자료형() 메서드를 사욜하여 여러 자료형에 대해 입력을 받을 수 있음
        sc.nextLine(); // 공백 제거용. nextInt()에서 엔터는 받지 않고 숫자 입력만 받아서 입력 스트림에 아직 엔터가 남아있는 상태임
                       // 이때 남은 엔터가 다음 입력중 nextLine()이 존재한다면 거기 입력에 들어가버려서 잘못 입력되는 일이 생김
                       // 이를 방지하기 위해 nextLine()을 밑에 하나 써서 엔터키 입력을 대신 받아줌

        ProductOrder products[] = new ProductOrder[size];

        for (int i = 0; i < size; i++)
        {
            System.out.println(i + 1 + "번째 주분 정보를 입력하세요.");
            
            System.out.print("상품명: ");
            String Name = sc.nextLine(); // nextLine()으로 문자열을 입력받을 수 있음

            System.out.print("가격: ");
            int Price = sc.nextInt();

            System.out.print("수량: ");
            int Quantity = sc.nextInt();

            sc.nextLine(); // 공백 제거용

            products[i] = createOrder(Name, Price, Quantity);
        }

        printOrders(products);

        int totalAmount = getTotalAmount(products);
        System.out.println(totalAmount);

        sc.close();
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
