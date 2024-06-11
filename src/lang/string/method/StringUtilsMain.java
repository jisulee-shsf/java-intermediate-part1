package lang.string.method;

public class StringUtilsMain {

    public static void main(String[] args) {
        int num = 100;
        String str = "java";
        boolean bool = true;

        //1. format()
        String str1 = String.format("num = %d, str = %s, bool = %b", num, str, bool);
        System.out.println(str1); //num = 100, str = java, bool = true

        String str2 = String.format("num = %.2f", 10.000);
        System.out.println(str2); //num = 10.00

        //2. printf()
        System.out.printf("num = %.3f", 10.000); //num = 10.000
    }
}
