package Task1;

public class Main {
    public static void main(String[] args) throws StringExceptionAbc {
        StringTasks obj1 = new StringTasks("1234-abc-5558-rty-1a2b");
        StringTasks obj2 = new StringTasks("5551234-5558-rty-1a2bb");
//abc
        String rez1 = StringTasks.checkABC(obj1.getStr1());
        System.out.println("////////////////////////////////");
        String rez2 = StringTasks.checkABC(obj2.getStr1());
        System.out.println("////////////////////////////////");

//555
        System.out.println("А теперь поищем 555");
        String rez3 = StringTasks.check555(obj1.getStr1());
        System.out.println("////////////////////////////////");
        String rez4 = StringTasks.check555(obj2.getStr1());
        System.out.println("////////////////////////////////");
//1a2b

        System.out.println("А теперь поищем 1a2b");
        StringTasks.checkEndStringOn1a2b(obj1.getStr1());
        System.out.println("////////////////////////////////");
        StringTasks.checkEndStringOn1a2b(obj2.getStr1());
        System.out.println("////////////////////////////////");




    }
}
