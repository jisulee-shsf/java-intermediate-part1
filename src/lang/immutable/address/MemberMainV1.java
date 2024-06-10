package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1(address);
        MemberV1 memberB = new MemberV1(address);
        System.out.println("memberA = " + memberA); //memberA = MemberV1{address=Address{value=서울}}
        System.out.println("memberB = " + memberB); //memberB = MemberV1{address=Address{value=서울}}

        memberB.getAddress().setValue("부산");
        System.out.println("memberA = " + memberA); //memberA = MemberV1{address=Address{value=부산}}
        System.out.println("memberB = " + memberB); //memberB = MemberV1{address=Address{value=부산}}
    }
}
