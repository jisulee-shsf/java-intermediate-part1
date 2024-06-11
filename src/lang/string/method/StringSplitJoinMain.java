package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "hello,java,spring";

        //1. split()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.print(s + " "); //hello java spring
        }

        //2. join()
        String joinStr1 = "";
        for (int i = 0; i < splitStr.length; i++) {
            joinStr1 += splitStr[i];
            if (i != splitStr.length - 1) {
                joinStr1 += ".";
            }
        }
        System.out.println("joinStr1 = " + joinStr1); //hello.java.spring

        String joinStr2 = String.join(".", splitStr);
        System.out.println("joinStr2 = " + joinStr2); //hello.java.spring
    }
}
