package program;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class PhoneBook {
    private ArrayList<Person> phoneBookList = new ArrayList<>();
    private Scanner sin = new Scanner(System.in);

    public void manage() throws FileNotFoundException {
        open();
        int menu;

        while (true) {
            do {
                System.out.println("  ====  전화번호부  ====  ");
                System.out.println("1. 전화번호 추가");
                System.out.println("2. 전화번호 보기");
                System.out.println("3. 전화번호 검색");
                System.out.println("4. 전화번호 삭제");
                System.out.println("5. 전화번호 수정");
                System.out.println("0. 프로그램 종료");
                System.out.print("\n메뉴를 선택해주세요: ");

                menu = sin.nextInt();
            } while (menu < 0 || menu > 7);

            switch (menu) {
                case 1:
                    add();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    modify();
                    break;
                case 0:
                    System.out.println("\n프로그램을 종료합니다.");
                    save();
                    return;
            }
        }
    }

    public void save() throws FileNotFoundException {
        System.out.println("\n전화번호 저장 기능입니다.");

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("JavaProgramming/Files/phonebook.dat"))) {
            oos.writeObject(phoneBookList);
            System.out.println("전화번호부 저장 완료.\n");
        } catch (IOException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    public void open() {
        System.out.println("\n전화번호 읽기 기능입니다.");

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("JavaProgramming/Files/phonebook.dat"))) {
            phoneBookList = (ArrayList<Person>) ois.readObject();
            System.out.println("전화번호부 읽기 완료.\n");
        } catch (Exception e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    public void add() {
        System.out.println("\n전화번호 추가 기능입니다.");

        System.out.print("이름: ");
        String name = sin.next();
        System.out.print("전화번호: ");
        String telNum = sin.next();

        Person person = new Person(name, telNum);

        phoneBookList.add(person);
        System.out.println("전화번호가 추가되었습니다.\n");
    }

    public void view() {
        System.out.println("\n전화번호 보기 기능입니다.\n");

        for (Person person : phoneBookList) {
            System.out.println(person);
        }
        System.out.println("총 " + phoneBookList.size() + " 명을 출력했습니다.\n");
    }

    public void search() {
        System.out.println("\n전화번호 검색 기능입니다.");

        System.out.print("검색할 이름 또는 전화번호 : ");
        String str = sin.next();
        boolean searchResult = false;
        Person person = null;

        for (Person value : phoneBookList) {
            person = value;

            if (str.equals(person.getName()) ||
                    str.equals(person.getTelNum())) {
                searchResult = true;
                break;
            }
        }

        if (searchResult) {
            System.out.println(person + "\n");
        } else {
            System.out.println("검색한 이름 또는 전화번호가 없습니다.");
        }
    }

    public void delete() {
        System.out.println("\n전화번호 삭제 기능입니다.");

        System.out.print("삭제할 이름 또는 전화번호 : ");
        String str = sin.next();
        boolean searchResult = false;
        Person person = null;

        for (Person value : phoneBookList) {
            person = value;

            if (str.equals(person.getName()) ||
                    str.equals(person.getTelNum())) {
                searchResult = true;
                break;
            }
        }

        if (searchResult) {
            System.out.print(person + "를 삭제할까요?(Y/N): ");

            if (sin.next().equals("Y")) {
                phoneBookList.remove(person);
                System.out.println(person + " 를 삭제했습니다.\n");
            }
        } else {
            System.out.println("삭제할 이름 또는 전화번호가 없습니다.");
        }
    }

    public void modify() {
        System.out.println("\n전화번호 수정 기능입니다.");

        System.out.print("수정할 이름 또는 전화번호 : ");
        String str = sin.next();
        boolean searchResult = false;
        Person person = null;

        for (Person value : phoneBookList) {
            person = value;

            if (str.equals(person.getName()) ||
                    str.equals(person.getTelNum())) {
                searchResult = true;
                break;
            }
        }

        if (searchResult) {
            System.out.println("현재 정보: " + person);
            System.out.print("새 이름 (변경 없으면 - 입력): ");
            String newName = sin.next();
            System.out.print("새 전화번호 (변경 없으면 - 입력): ");
            String newTelNum = sin.next();

            if (!newName.equals("-")) {
                person.setName(newName);
            }
            if (!newTelNum.equals("-")) {
                person.setTelNum(newTelNum);
            }

            System.out.println("수정 완료: " + person + "\n");
        } else {
            System.out.println("수정할 이름 또는 전화번호가 없습니다.");
        }
    }
}
