package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 4;

    public void process(int paramVar) {
        int localVar = 2;

        Printer printer = new Printer() {
            int value = 1;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.getClass() = " + printer.getClass()); //class nested.anonymous.AnonymousOuter$1
    }

    public static void main(String[] args) {
        AnonymousOuter anonymousOuter = new AnonymousOuter();
        anonymousOuter.process(3);
    }
}
