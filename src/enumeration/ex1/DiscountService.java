package enumeration.ex1;

public class DiscountService {

    public int discount(String grade, int price) {
        int discountPercent = 0;

        if (grade.equals(StringGrade.A)) {
            discountPercent = 10;
        } else if (grade.equals(StringGrade.B)) {
            discountPercent = 20;
        } else if (grade.equals(StringGrade.C)) {
            discountPercent = 30;
        } else {
            System.out.println("할인이 적용되지 않습니다.");
        }
        return price * discountPercent / 100;
    }
}
