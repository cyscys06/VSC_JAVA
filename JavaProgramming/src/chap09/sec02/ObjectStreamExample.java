package chap09.sec02;

import java.io.*;
import chap09.Class.Donut;

public class ObjectStreamExample {
    public static void main(String[] args) {
        Donut myDonut =
                new Donut("딸기 링 도넛", 2000, true);

        try (
                ObjectOutputStream out =
                        new ObjectOutputStream(
                                new FileOutputStream("JavaProgramming/Files/donut.obj"))
        ) {
            out.writeObject(myDonut);
            System.out.println("도넛 객체가 파일에 저장됨.");

        } catch (IOException e) {
            System.err.println("객체 쓰기 오류 발생: "
                    + e.getMessage());
        }

        try (
                ObjectInputStream in =
                        new ObjectInputStream(
                                new FileInputStream("JavaProgramming/Files/donut.obj"))
        ) {
            Donut readDonut = (Donut) in.readObject();

            System.out.println("\n파일에서 도넛 객체 읽기:");
            System.out.println(readDonut);

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("객체 읽기 오류 발생: "
                    + e.getMessage());
        }
    }
}