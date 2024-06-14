package enumeration.ex2;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == ClassGrade.A) {
            discountPercent = 10;
        } else if (classGrade == ClassGrade.B) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.C) {
            discountPercent = 30;
        } else {
            System.out.println("할인이 적용되지 않습니다.");
        }
        return price * discountPercent / 100;
    }
}
