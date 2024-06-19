package nested.nested;

public class NestedOuter {
    private static int classValue = 2;
    private int instanceValue = 3;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            System.out.println("nestedInstanceValue = " + nestedInstanceValue);
            System.out.println("NestedOuter.classValue = " + NestedOuter.classValue);
//            System.out.println("NestedOuter.instanceValue = " + NestedOuter.instanceValue);
        }
    }
}
