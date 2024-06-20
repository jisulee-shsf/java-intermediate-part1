package nested.inner.ex1;

public class Engine {
    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    public void start() {
        System.out.println("모델명 = " + car.getModel());
        System.out.println("충전 레벨 = " + car.getChargeLevel());
    }
}
