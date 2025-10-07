package section7.problem7;

import section7.myclass7.Item;
import section7.myclass7.ShoppingCart;

public class problem7_2 
{
    public static void main(String[] args) 
    {
        ShoppingCart cart = new ShoppingCart(); // 새로운 객체 생성

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}