package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2(address);
        MemberV2 memberB = new MemberV2(address);
        System.out.println("memberA = " + memberA); //memberA = MemberV2{address=ImmutableAddress{value=서울}}
        System.out.println("memberB = " + memberB); //memberB = MemberV2{address=ImmutableAddress{value=서울}}

//        memberB.getAddress().setValue("부산");
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("memberA = " + memberA); //memberA = MemberV2{address=ImmutableAddress{value=서울}}
        System.out.println("memberB = " + memberB); //memberB = MemberV2{address=ImmutableAddress{value=부산}}
    }
}
