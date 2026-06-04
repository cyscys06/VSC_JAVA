package chap09.Class;

import java.io.Serializable;

public class Donut implements Serializable {
    private String name;
    private int price;
    private boolean hasStock;

    public Donut(String name, int price, boolean hasStock) {
        this.name = name;
        this.price = price;
        this.hasStock = hasStock;
    }

    @Override
    public String toString() {
        return "이름: " + name
                + ", 가격: " + price + "원"
                + ", 재고 있음: " + hasStock;
    }
}