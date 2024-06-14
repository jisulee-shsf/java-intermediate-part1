package enumeration.ref2;

import static enumeration.ref2.Grade.*;

public class ClassGradeRefMain {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int discountA = discountService.discount(A, price);
        int discountB = discountService.discount(B, price);
        int discountC = discountService.discount(C, price);
        System.out.println("discountA = " + discountA);
        System.out.println("discountB = " + discountB);
        System.out.println("discountC = " + discountC);
    }
}
