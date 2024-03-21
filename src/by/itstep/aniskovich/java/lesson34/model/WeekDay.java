package by.itstep.aniskovich.java.lesson34.model;

public class WeekDay {
    private final String name;
    private final int number;

    public WeekDay() {
        name = "Monday";
        number = 1;
    }

    public WeekDay(String name, int number) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "[" + number + "]";
    }
}
