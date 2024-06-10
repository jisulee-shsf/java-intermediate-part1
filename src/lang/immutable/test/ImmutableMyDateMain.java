package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 6, 10);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1); //date1 = MyDate{year=2024, month=6, day=10}
        System.out.println("date2 = " + date2); //date2 = MyDate{year=2024, month=6, day=10}

        String refValue1 = Integer.toHexString(System.identityHashCode(date1));
        String refValue2 = Integer.toHexString(System.identityHashCode(date2));
        System.out.println("refValue1 = " + refValue1); //refValue1 = 19469ea2
        System.out.println("refValue2 = " + refValue2); //refValue2 = 19469ea2


        date1 = date1.withYear(2025);
        System.out.println("date1 = " + date1); //date1 = MyDate{year=2025, month=6, day=10}
        System.out.println("date2 = " + date2); //date2 = MyDate{year=2024, month=6, day=10}

        refValue1 = Integer.toHexString(System.identityHashCode(date1));
        refValue2 = Integer.toHexString(System.identityHashCode(date2));
        System.out.println("refValue1 = " + refValue1); //refValue1 = 13221655
        System.out.println("refValue2 = " + refValue2); //refValue2 = 19469ea2
    }
}
