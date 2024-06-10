package lang.immutable.change;

public class ImmutableMain {

    public static void main(String[] args) {

        ImmutableObj immutableObj1 = new ImmutableObj(10);
        ImmutableObj immutableObj2 = immutableObj1.add(30);

        System.out.println("immutableObj1.getValue() = " + immutableObj1.getValue()); //immutableObj1.getValue() = 10
        System.out.println("immutableObj2.getValue() = " + immutableObj2.getValue()); //immutableObj2.getValue() = 40
    }
}
