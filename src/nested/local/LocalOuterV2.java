package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 4;

    public void process(int paramVar) {
        int localVar = 2;

        class LocalPrinter implements Printer {
            int value = 1;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(3);
    }
}
