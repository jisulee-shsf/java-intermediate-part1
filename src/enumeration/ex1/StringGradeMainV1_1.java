package enumeration.ex1;

public class StringGradeMainV1_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int discountA = discountService.discount(StringGrade.A, price);
        int discountB = discountService.discount(StringGrade.B, price);
        int discountC = discountService.discount(StringGrade.C, price);
        System.out.println("discountA = " + discountA);
        System.out.println("discountB = " + discountB);
        System.out.println("discountC = " + discountC);
    }
}
