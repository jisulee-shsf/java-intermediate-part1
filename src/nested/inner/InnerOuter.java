package nested.inner;

public class InnerOuter {
    private static int classValue = 2;
    private int InstanceValue = 3;

    class Inner {
        private int InnerInstanceValue = 1;

        public void print() {
            System.out.println("InnerInstanceValue = " + InnerInstanceValue);
            System.out.println("classValue = " + classValue);
            System.out.println("InstanceValue = " + InstanceValue);
        }
    }
}
