package chap09.sec02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCopyExample {
    public static void main(String[] args) {
        try (
                BufferedReader fin =
                        new BufferedReader(new FileReader("JavaProgramming/Files/menu.txt"));
                BufferedWriter fout =
                        new BufferedWriter(new FileWriter("JavaProgramming/Files/new_menu.txt"))
        ) {
            String line;

            while ((line = fin.readLine()) != null) {
                fout.write(line);
                fout.newLine();
            }

            System.out.println("버퍼를 사용하여 복사 완료!");

        } catch (IOException e) {
            System.err.println("복사 중 오류 발생: " + e.getMessage());
        }
    }
}
