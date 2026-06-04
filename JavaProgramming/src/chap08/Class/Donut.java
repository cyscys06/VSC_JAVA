package chap08.Class;

import java.util.Objects;

public class Donut {
    private final String name;

    public Donut(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Donut)) return false;
        Donut donut = (Donut) obj;
        return name.equals(donut.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}
