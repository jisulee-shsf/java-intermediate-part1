package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 4;

    public Printer process(int paramVar) {
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
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(3);
        printer.print();


        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
    }
}
