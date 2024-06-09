package lang.object.tostring;

public class ToStringMain {

    public static void main(String[] args) {
        Car car = new Car("car");
        Cat cat = new Cat("cat");

        //1. 단순 totoString() 호출
        System.out.println(car.toString());
        System.out.println(cat.toString());

        //2. println() 내부에서 toString 호출
        System.out.println(car);
        System.out.println(cat);

        //3. Object 다형성 활용
        ObjectPrinter.print(car);
        ObjectPrinter.print(cat);

        String refValue = Integer.toHexString(System.identityHashCode(car));
        System.out.println("refValue = " + refValue);
    }
}
