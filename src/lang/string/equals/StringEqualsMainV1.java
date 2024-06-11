package lang.string.equals;

public class StringEqualsMainV1 {

    public static void main(String[] args) {
        String str1 = new String("java");
        String str2 = new String("java");
        System.out.println("(str1 == str2) = " + (str1 == str2)); //false
        System.out.println("str1.equals(str2) = " + str1.equals(str2)); //true

        String str3 = "java";
        String str4 = "java";
        System.out.println("(str3 == str4) = " + (str3 == str4)); //true
        System.out.println("str3.equals(str4) = " + str3.equals(str4)); //true
        System.out.println("getRefValue(str3) = " + getRefValue(str3)); //5a0466e9
        System.out.println("getRefValue(str4) = " + getRefValue(str4)); //5a0466e9
    }

    private static String getRefValue(String str) {
        return Integer.toHexString(System.identityHashCode(str));
    }
}
