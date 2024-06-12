package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

    public static void main(String[] args) throws Exception {
        //1. Class 조회
        Class clazz = String.class;
//        Class clazz = new String().getClass();
//        Class clazz = Class.forName("java.lang.String");

        //2. 필드 조회
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField); //private final byte[] java.lang.String.value···
        }

        //3. 메서드 조회
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethod = " + declaredMethod); //public java.lang.String java.lang.String.toString()···
        }

        //4. 상위 클래스 조회
        Class superclass = clazz.getSuperclass();
        System.out.println("superclass = " + superclass); //class java.lang.Object

        //5. 인터페이스 조회
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("anInterface = " + anInterface); //interface java.io.Serializable···
        }
    }
}
