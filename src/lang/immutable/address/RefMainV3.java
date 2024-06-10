package lang.immutable.address;

public class RefMainV3 {

    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        System.out.println("a = " + a); //a = ImmutableAddress{value=서울}
        System.out.println("b = " + b); //b = ImmutableAddress{value=서울}

//        b.setValue("부산");
        b = new ImmutableAddress("부산");
        System.out.println("a = " + a); //a = ImmutableAddress{value=서울}
        System.out.println("b = " + b); //b = ImmutableAddress{value=부산}
    }
}
