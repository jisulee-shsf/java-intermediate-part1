package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int nums = 1_000_000_000;
        long startTime, endTime;

        //1. Wrapper 클래스 Long
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < nums; i++) {
            sumWrapper += i; // 오토 박싱
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper); //499999999500000000
        System.out.println("endTime - startTime = " + (endTime - startTime) + "ms"); //3485ms

        //2. 기본형 long
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < nums; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive); //499999999500000000
        System.out.println("endTime - startTime = " + (endTime - startTime) + "ms"); //440ms
    }
}
