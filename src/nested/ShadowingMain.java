package nested;

public class ShadowingMain {
    public int value = 1;

    class Inner {
        public int value = 2;

        void print() {
            int value = 3;
            System.out.println("value = " + value); //3
            System.out.println("this.value = " + this.value); //2
            System.out.println("ShadowingMain.this.value = " + ShadowingMain.this.value); //1
        }
    }

    public static void main(String[] args) {
        ShadowingMain shadowingMain = new ShadowingMain();
        Inner inner = shadowingMain.new Inner();
        inner.print();
    }
}
