package enumeration.ex0;

public class StringGradeMainV0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //1. 존재하지 않는 등급을 입력한 경우
        int discountZ = discountService.discount("Z", price);
        System.out.println("discountZ = " + discountZ);

        //2. 대소문자 구분이 안 된 경우
        int discounta = discountService.discount("a", price);
        System.out.println("discounta = " + discounta);

        //3. 오타가 난 경우
        int discountAAA = discountService.discount("AAA", price);
        System.out.println("discountAAA = " + discountAAA);
    }
}
