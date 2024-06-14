package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class EnumGradeRefMain {

    public static void main(String[] args) {
        System.out.println("A.getClass() = " + A.getClass()); //class enumeration.ex3.Grade
        System.out.println("B.getClass() = " + B.getClass()); //class enumeration.ex3.Grade
        System.out.println("C.getClass() = " + C.getClass()); //class enumeration.ex3.Grade

        System.out.println("refValueA = " + refValue(A)); //30f39991
        System.out.println("refValueB = " + refValue(B)); //452b3a41
        System.out.println("refValueC = " + refValue(C)); //4a574795
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
