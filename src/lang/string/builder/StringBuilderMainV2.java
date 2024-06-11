package lang.string.builder;

public class StringBuilderMainV2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = sb.append("h").append("e").append("l").append("l").append("o")
                .insert(5, "java")
                .delete(5, sb.length())
                .reverse()
                .toString();

        System.out.println(str); //olleh
    }
}
