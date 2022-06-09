package Task2_Login_Password;

public class Main {
    public static void main(String[] args) {
        UserInformation user1 = new UserInformation("user", "ttttttttttttttt1", "ttttttttttttttt1");
        boolean rezult = UserInformation.checkInfoUser(user1);
        System.out.println(rezult);
        System.out.println(user1.toString());

    }
}
