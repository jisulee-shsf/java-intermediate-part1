package lang.wrapper;

public class MyIntegerMethodMainV1 {

    public static void main(String[] args) {
        int value = 10;
        int result = compareTo(value, 3);
        System.out.println("result = " + result); //1
    }

    private static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
