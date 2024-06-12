package lang.wrapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {
        //1. 변환
        Integer integer1 = Integer.valueOf(10); // 래퍼 타입 반환
        Integer integer2 = Integer.valueOf("10"); // 래퍼 타입 반환
        int intValue = Integer.parseInt("10"); // 기본형 반환

        //2. 비교
        int i1 = integer1.compareTo(10);
        System.out.println("i1 = " + i1); //0

        //3. 산술
        int i2 = Integer.min(3, 10);
        int i3 = Integer.max(3, 10);
        int i4 = Integer.sum(3, 10);
        System.out.println("i2 = " + i2); //3
        System.out.println("i3 = " + i3); //10
        System.out.println("i4 = " + i4); //13
    }
}
