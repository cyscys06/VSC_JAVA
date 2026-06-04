package chap09.sec02;

import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {
        String donutName = "초코 크림 도넛";
        int donutPrice = 3500;
        boolean hasStock = true;

        try (
                DataOutputStream out =
                        new DataOutputStream(
                                new FileOutputStream("JavaProgramming/Files/donut.dat"))
        ) {
            out.writeUTF(donutName);
            out.writeInt(donutPrice);
            out.writeBoolean(hasStock);

            System.out.println("도넛 정보가 파일에 저장됨.");

        } catch (IOException e) {
            System.err.println("쓰는 중 오류 발생: " + e.getMessage());
        }

        try (
                DataInputStream in =
                        new DataInputStream(
                                new FileInputStream("JavaProgramming/Files/donut.dat"))
        ) {
            String readName = in.readUTF();
            int readPrice = in.readInt();
            boolean readStock = in.readBoolean();

            System.out.println("\n파일에서 도넛 정보 읽기:");
            System.out.println("이름: " + readName);
            System.out.println("가격: " + readPrice + "원");
            System.out.println("재고 있음: " + readStock);

        } catch (IOException e) {
            System.err.println("읽는 중 오류 발생: " + e.getMessage());
        }
    }
}
