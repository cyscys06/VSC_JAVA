package chap08.sec02;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("초코 도넛", 2500);
        hm.put("딸기 도넛", 2700);
        hm.put("크림 도넛", 2500);
        hm.put("초코 도넛", 2700);

        System.out.println("도넛 가격 목록:");
        for (String name : hm.keySet()) {
            System.out.println(name + ": " + hm.get(name) + "원");
        }
    }
}
