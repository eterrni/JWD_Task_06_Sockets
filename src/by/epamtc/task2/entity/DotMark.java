package by.epamtc.task2.entity;

public class DotMark implements TextComponent {

    static final long SerialVersionUID = -8L;
    private static final String value = ".";
    private static final DotMark instance = new DotMark();

    public DotMark() {
    }

    public static DotMark getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "DotMark{" + value + "}";
    }

    @Override
    public String getValue() {
        return value;
    }
}
