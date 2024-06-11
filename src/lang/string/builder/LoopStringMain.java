package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += "java ";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("str = " + str);
        System.out.println("time = " + (endTime - startTime) + "ms"); //3368ms
    }
}
