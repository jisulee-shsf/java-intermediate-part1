package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        //1. 박싱(Boxing)
        Integer integerObj1 = new Integer(10);
        Integer integerObj2 = Integer.valueOf(10);
        System.out.println("integerObj1 = " + integerObj1); //10
        System.out.println("integerObj2 = " + integerObj2); //10

        //2. 언박싱(Unboxing)
        int intValue = integerObj1.intValue();
        System.out.println("intValue = " + intValue); //10

        //3. 비교
        System.out.println("integerObj1 == integerObj2 = " + (integerObj1 == integerObj2)); //false
        System.out.println("integerObj1.equals(integerObj2) = " + integerObj1.equals(integerObj2)); //true

        Integer integerObj3 = Integer.valueOf(10);
        System.out.println("integerObj2 == integerObj3 = " + (integerObj2 == integerObj3)); //true
        System.out.println("integerObj2.equals(integerObj3) = " + integerObj2.equals(integerObj3)); //true
    }
}
