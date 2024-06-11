package lang.string.immutable;

public class StringimmutableMain {

    public static void main(String[] args) {
        String str1 = "hello";
        str1.concat("java");
        System.out.println("str1 = " + str1); //hello

        String str2 = str1.concat("java");
        System.out.println("str2 = " + str2); //hellojava
    }
}
