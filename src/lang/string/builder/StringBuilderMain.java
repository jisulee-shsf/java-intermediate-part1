package lang.string.builder;

public class StringBuilderMain {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //1. append()
        sb.append("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb); //hello

        //2. insert()
        sb.insert(5, "java");
        System.out.println(sb); //hellojava

        //3. delete()
        sb.delete(5, sb.length());
        System.out.println(sb); //hello

        //4. reverse()
        sb.reverse();
        System.out.println(sb); //olleh

        //5. toString()
        String str = sb.toString();
        System.out.println(str); //olleh
    }
}
