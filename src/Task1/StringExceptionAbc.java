package Task1;

public class StringExceptionAbc extends Exception{
    String str;
    public StringExceptionAbc(String s){
        this.str = s;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String getMessage() {
        return "Attention ExceptionABC - � ������: " + str +  "\n ��� ����� abc.\n" +
                "���������� ��������� ������ � ����� ��� ������� - ������� abc";
    }
}
