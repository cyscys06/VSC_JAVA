package chap08.Class;

public class DonutShop {
    interface Makeable {
        void makeDonut(String donutType);
    }

    public static void main(String[] args) {
        Makeable donutMaker = new Makeable() {
            @Override
            public void makeDonut(String donutType) {
                System.out.println(donutType + " 도넛을 만들고 있습니다.");
            }
        };
        donutMaker.makeDonut("초코");
    }
}
