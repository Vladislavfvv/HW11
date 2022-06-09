package Task2_Login_Password;

public class UserInformation {
    String login;
    String password;
    String confirmPassword;

    public UserInformation(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "UserInformation{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }

    public static boolean checkInfoUser(UserInformation user) {
        boolean flag = true;
        try {
            if (user.login.length() > 20) {
                flag = false;
                throw new WrongLoginException("����� �� ������ ���� ������ 20 ��������");

            }
            if (user.login.contains(" ")) {
                flag = false;
                throw new WrongLoginException("����� �� ������ ��������� ������ ��������");
            }
            if (user.password.length() > 20) {
                flag = false;
                throw new WrongPasswordException("Password �� ������ ���� ������ 20 ��������");
            }
            if (user.password.contains("[0-9]+")) {
                flag = false;
                throw new WrongPasswordException("Password ������ ��������� �� ����� ����� �����");
            }
//            boolean flag = false;
//            String regex = "[0-9]+";
//            char[] chars = user.password.toCharArray();
//            for (int i = 0; i < chars.length-1; i++) {
//                if (chars[i] =
//            }

            if (!(user.password.contains("1")) || (user.password.contains("2")) ||
                    (user.password.contains("3")) ||(user.password.contains("4")) ||
                    (user.password.contains("5")) || (user.password.contains("6")) ||
                    (user.password.contains("7")) || (user.password.contains("8")) ||
                    (user.password.contains("9")) || (user.password.contains("0"))) {
                flag = false;
           // if (user.password.contains("^[a-zA-Z0-9]+")) {
                throw new WrongPasswordException("Password ������ ��������� ���� �� 1 �����");
            }
            if(!user.password.equals(user.confirmPassword)) {
                flag = false;
                throw new WrongPasswordException("�� ����������� ����������� ������");
            }

        } catch (WrongLoginException e) {
            System.out.println(e);

        } catch (WrongPasswordException e) {
            System.out.println(e);

        }
        return flag;
    }
}
