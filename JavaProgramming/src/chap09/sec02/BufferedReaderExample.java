package chap09.sec02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (
                BufferedReader fin =
                        new BufferedReader(new FileReader("JavaProgramming/Files/menu.txt"))
        ) {
            String line;

            while ((line = fin.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("텍스트 중요 오류 발생: " + e.getMessage());
        }
    }
}