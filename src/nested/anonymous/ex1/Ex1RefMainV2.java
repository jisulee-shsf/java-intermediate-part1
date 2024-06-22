package nested.anonymous.ex1;

import java.util.Random;

public class Ex1RefMainV2 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        class HelloDice implements Process {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + randomValue);
            }
        }

        class HelloSum implements Process {

            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        HelloDice helloDice = new HelloDice();
        HelloSum helloSum = new HelloSum();

        hello(helloDice);
        hello(helloSum);
    }
}
