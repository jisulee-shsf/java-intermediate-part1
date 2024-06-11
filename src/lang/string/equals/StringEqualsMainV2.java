package lang.string.equals;

public class StringEqualsMainV2 {

    public static void main(String[] args) {
        String str1 = new String("java");
        String str2 = new String("java");
        System.out.println("identity - isSame() = " + isSame(str1, str2)); //false
        System.out.println("equality - isSame() = " + isSame(str1, str2)); //true

        String str3 = "java";
        String str4 = "java";
        System.out.println("identity - isSame() = " + isSame(str3, str4)); //true
        System.out.println("equality - isSame() = " + isSame(str3, str4)); //true
    }

    private static boolean isSame(String x, String y) {
//        return x == y; //identity
        return x.equals(y); //equality
    }
}
