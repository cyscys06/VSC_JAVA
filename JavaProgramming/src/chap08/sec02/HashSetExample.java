package chap08.sec02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("초코 도넛");
        hs.add("딸기 도넛");
        hs.add("크림 도넛");
        hs.add("초코 도넛");

        System.out.println("등록된 도넛 메뉴:");
        for (String donut : hs) {
            System.out.println(donut);
        }
    }
}
