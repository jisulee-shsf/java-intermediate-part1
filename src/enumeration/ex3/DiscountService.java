package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        if (grade == A) {
            discountPercent = 10;
        } else if (grade == B) {
            discountPercent = 20;
        } else if (grade == C) {
            discountPercent = 30;
        } else {
            System.out.println("할인이 적용되지 않습니다.");
        }
        return price * discountPercent / 100;
    }
}
