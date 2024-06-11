package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("java");
        System.out.println("str1 = " + str1); //hello
        System.out.println("str2 = " + str2); //java
        System.out.println(str1.concat(str2)); //hellojava
        System.out.println(str1 + str2); //hellojava
    }
}
