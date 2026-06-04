package chap08.sec01;

import chap08.Class.Box;
import chap08.Class.Donut;

public class GenericsExample {
    public static void main(String[] args) {
        Donut myDonut = new Donut("초코 도넛");
        Box<Donut> myBox = new Box<>(myDonut);

        Donut d1 = myBox.getItem();
        System.out.println("상자에서 꺼낸 도넛: " + d1.getName());
    }
}
