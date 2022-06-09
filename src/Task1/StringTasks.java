package Task1;

import java.util.Arrays;

public class StringTasks {
    String str1;

    public StringTasks(String str1) {
        this.str1 = str1;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }


    public static String checkABC(String s) {
        try {
            if (!s.contains("abc"))
                throw new StringExceptionAbc(s);
            System.out.println("������: " + s + "\n �������� abc");
        } catch (StringExceptionAbc e) {
            System.out.println(e.getMessage());
        }
        return "������ �������� abc";
    }


    public static String check555(String s) {
        char[] arr = s.toCharArray();
        try {
            if (arr[0] == '5' && arr[1] == '5' && arr[0] == '5') {
                System.out.println("You are luky))) � ������: " + s +
                        "\n ���� � ������ 555");
                return "";
            } else throw new StringException555(s);
        } catch (StringException555 e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    public static void checkEndStringOn1a2b(String s) {
        char[] chars = s.toCharArray();
        try {
            if (chars[chars.length - 1] == 'b' && chars[chars.length - 2] == '2' &&
                    chars[chars.length - 3] == 'a' && chars[chars.length - 4] == '1')
                System.out.println("� ����� ������: " + s + "\n ���� ��������� 1a2b");
            else throw new StringException1a2b(s);
        } catch (StringException1a2b e) {
            System.out.println(e.toString());
        }
    }

    public static void check1a2b(String s) {//18-21
        System.out.println(s.substring(18, 22));
        if (s.substring(18, 22).contains("1a2b"))
            System.out.println("����� ��������� �������� ������������������ 1a2b");
        else System.out.println("����� ��������� �� �������� ������������������ 1a2b");
    }


    public static void findShortSubstring(String s) {
        String[] arr = s.split(" ");
        String min;
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i; j >= 0; j--)
                if (arr[j].toCharArray().length > arr[j + 1].toCharArray().length) {
                    min = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = min;
                }
        System.out.println("��� ��������������� ������ ����: " + Arrays.toString(arr));
        System.out.println("����� �������� �����: " + arr[0]);
        System.out.println("����� ������� �����: " + arr[arr.length - 1]);
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) == 0) k = i + 1;
        }
        System.out.println(arr[k]);
    }


}

