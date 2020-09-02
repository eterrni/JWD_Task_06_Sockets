package by.epamtc.task2.entity;

public class NewLine implements TextComponent {

    static final long SerialVersionUID = -9L;

    private static final String value = "\n";

    @Override
    public String toString() {
        return "NewLine{" + value + "}";
    }

    public static NewLine getInstance() {
        return instance;
    }

    public NewLine() {
    }

    private static final NewLine instance = new NewLine();

    @Override
    public String getValue() {
        return value;
    }
}
