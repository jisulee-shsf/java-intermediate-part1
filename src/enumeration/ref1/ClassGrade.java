package enumeration.ref1;

public class ClassGrade {
    public static final ClassGrade A = new ClassGrade(10);
    public static final ClassGrade B = new ClassGrade(20);
    public static final ClassGrade C = new ClassGrade(30);

    private final int discountPercent;

    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
