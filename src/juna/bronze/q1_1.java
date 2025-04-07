package juna.bronze;

import java.util.Scanner;

public class q1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int input = scanner.nextInt();
            if (input % 25 != 0) {
                System.out.print(input / 25 + " ");
                input = (input % 25);
            } else {
                System.out.print(input / 25 + " " + 0 + " " + 0 + " " + 0 + "\n");
                continue;
            }
            if (input % 10 != 0) {
                System.out.print(input / 10 + " ");
                input = (input % 10);
            } else {
                System.out.print(input / 10 + " " + 0 + " " + 0 + "\n");
                continue;
            }
            if (input % 5 != 0) {
                System.out.print(input / 5 + " ");
                input = input % 5;
            } else {
                System.out.print(input / 5 + " " + 0 + "\n");
                continue;
            }
            System.out.print(input + "\n");
        }
    }
}