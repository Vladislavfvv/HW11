package Task1;

public class StringException1a2b extends Exception{
    String str;

    public StringException1a2b(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "�������� ���� ��� ��� ������: " + str + " \n �� ������������� �� 1a2b";
    }
}
