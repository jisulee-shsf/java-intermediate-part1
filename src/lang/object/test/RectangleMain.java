package lang.object.test;

public class RectangleMain {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(100, 20);
        Rectangle rect2 = new Rectangle(100, 20);

        System.out.println("identity = " + (rect1 == rect2));
        System.out.println("equality = " + rect1.equals(rect2));
    }
}
