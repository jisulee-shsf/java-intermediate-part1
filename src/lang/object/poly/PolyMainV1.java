package lang.object.poly;

public class PolyMainV1 {
    public static void main(String[] args) {
        Car car = new Car();
        Cat cat = new Cat();

        action(car);
        action(cat);
    }

    public static void action(Object obj) {
        if (obj instanceof Car car) {
            car.move();
        } else if (obj instanceof Cat cat) {
            cat.sound();
        }
    }
}
