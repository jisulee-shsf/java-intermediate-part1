package lang.wrapper;

public class MyIntegerMethodMainV2 {

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);
        int result = myInteger.compareTo(3);
        System.out.println("result = " + result); //1
    }
}
