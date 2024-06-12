package lang.wrapper;

public class MyIntegerNullMainV1 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1};
        int result1 = findValue(intArr, -1);
        int result2 = findValue(intArr, 3);
        System.out.println("result1 = " + result1); //-1
        System.out.println("result2 = " + result2); //-1
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}
