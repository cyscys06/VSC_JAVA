package chap08.sec02;

import java.util.HashSet;

import chap08.Class.Donut;

public class HashCodeExample {
    public static void main(String[] args) {
        HashSet<Donut> set = new HashSet<>();
        set.add(new Donut("초코 도넛"));
        set.add(new Donut("크림 도넛"));
        set.add(new Donut("크림 도넛"));

        System.out.println("도넛 객체 중복:");
        for (Donut donut : set) {
            System.out.println(donut);
        }
    }
}
