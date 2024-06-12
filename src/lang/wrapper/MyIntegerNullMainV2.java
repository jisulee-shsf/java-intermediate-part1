package lang.wrapper;

public class MyIntegerNullMainV2 {

    public static void main(String[] args) {
        MyInteger[] myIntegers = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        MyInteger result1 = findValue(myIntegers, -1);
        MyInteger result2 = findValue(myIntegers, 3);
        System.out.println("result1 = " + result1); //-1
        System.out.println("result2 = " + result2); //null
    }

    private static MyInteger findValue(MyInteger[] myIntegers, int target) {
        for (MyInteger myInteger : myIntegers) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}
