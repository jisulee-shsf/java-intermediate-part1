package enumeration.ref3;

import static enumeration.ref3.Grade.*;

public class ClassGradeRefMainV3_1 {

    public static void main(String[] args) {
        int price = 10000;
        discount(A, price);
        discount(B, price);
        discount(C, price);
    }

    private static void discount(Grade grade, int price) {
        System.out.println(grade.name() + "등급의 할인 금액 = " + grade.discount(price));
    }
}
