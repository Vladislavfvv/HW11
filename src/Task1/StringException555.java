package Task1;

public class StringException555 extends Exception{
    String str;

    public StringException555(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "It's not 555!!!";
    }

    @Override
    public String getMessage() {
        return "Поищи что-нибудь еще";
    }
}
