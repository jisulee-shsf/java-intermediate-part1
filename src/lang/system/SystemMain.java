package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        //1-1. 현재 시간(밀리초)
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //1-2. 현재 시간(나노초)
        long currentTimeNamo = System.nanoTime();
        System.out.println("currentTimeNamo = " + currentTimeNamo);

        //2-1. 환경 변수
        System.out.println("getenv = " + System.getenv());

        //2-2. 시스템 속성
        System.out.println("properties = " + System.getProperties());
        System.out.println("java.version = " + System.getProperty("java.version"));

        //3. 배열 고속 복사
        char[] originalArray = {'j', 'a', 'v', 'a'};
        char[] copiedArray = new char[originalArray.length];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        System.out.println("copiedArray = " + Arrays.toString(copiedArray)); //copiedArray = [j, a, v, a]

        //4. 프로그램 종료
        System.exit(0);
    }
}
