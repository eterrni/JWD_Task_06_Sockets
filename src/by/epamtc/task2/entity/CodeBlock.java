package by.epamtc.task2.entity;


import java.util.Objects;

public class CodeBlock implements TextComponent {

    static final long SerialVersionUID = -4L;

    private String value = null;

    public CodeBlock(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CodeBlock{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodeBlock codeBlock = (CodeBlock) o;
        return Objects.equals(value, codeBlock.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
