package program;

import java.io.*;

public class Person implements Serializable {
    private String name;
    private String telNum;

    public Person(String name, String telNum) {
        super();
        this.name = name;
        this.telNum = telNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    @Override
    public String toString() {
        return name + " : " + telNum;
    }
}
