package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        //1. ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values)); //[A, B, C]

        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
/*          name = A, ordinal = 0
            name = B, ordinal = 1
            name = C, ordinal = 2
*/
        }

        //2. ENUM 변환
        String input = "A";
        Grade grade = Grade.valueOf(input);
        System.out.println("grade = " + grade); //A
    }
}
