package lang.wrapper;

public class AutoboxingMain {

    public static void main(String[] args) {
        //1. 오토 박싱(Autoboxing)
        int value = 10;
//        Integer boxedValue = Integer.valueOf(value);
        Integer autoBoxedValue = value;
        System.out.println("autoBoxedValue = " + autoBoxedValue); //10

        //2. 오토 언박싱(Auto-unboxing)
//        int unboxedValue = boxedValue.intValue();
        int autoUnboxedValue = autoBoxedValue;
        System.out.println("autoUnboxedValue = " + autoUnboxedValue); //10
    }
}
