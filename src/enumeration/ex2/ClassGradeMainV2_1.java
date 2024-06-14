package enumeration.ex2;

public class ClassGradeMainV2_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int discountA = discountService.discount(ClassGrade.A, price);
        int discountB = discountService.discount(ClassGrade.B, price);
        int discountC = discountService.discount(ClassGrade.C, price);
        System.out.println("discountA = " + discountA);
        System.out.println("discountB = " + discountB);
        System.out.println("discountC = " + discountC);
    }
}
