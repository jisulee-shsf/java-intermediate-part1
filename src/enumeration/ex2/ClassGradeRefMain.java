package enumeration.ex2;

public class ClassGradeRefMain {

    public static void main(String[] args) {
        System.out.println("ClassGrade.A.getClass() = " + ClassGrade.A.getClass()); //class enumeration.ex2.ClassGrade
        System.out.println("ClassGrade.B.getClass() = " + ClassGrade.B.getClass()); //class enumeration.ex2.ClassGrade
        System.out.println("ClassGrade.C.getClass() = " + ClassGrade.C.getClass()); //class enumeration.ex2.ClassGrade

        System.out.println("ClassGrade.A = " + ClassGrade.A); //enumeration.ex2.ClassGrade@30f39991
        System.out.println("ClassGrade.B = " + ClassGrade.B); //enumeration.ex2.ClassGrade@452b3a41
        System.out.println("ClassGrade.C = " + ClassGrade.C); //enumeration.ex2.ClassGrade@4a574795
    }
}
