package lang.immutable.address;

public class RefMainV1 {

    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a); //a = Address{value=서울}
        System.out.println("b = " + b); //b = Address{value=서울}

        b.setValue("부산");
        System.out.println("a = " + a); //a = Address{value=부산}
        System.out.println("b = " + b); //b = Address{value=부산}
    }
}
