package lang.object.poly;

public class PolyMainV2 {
    public static void main(String[] args) {
        Car car = new Car();
        Cat cat = new Cat();
        Object[] objects = {car, cat};

        size(objects);
    }

    public static void size(Object[] obj) {
        System.out.println(obj.length);
    }
}
