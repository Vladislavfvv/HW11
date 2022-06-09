package Task2_Login_Password;

public class WrongLoginException extends Exception{


    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
