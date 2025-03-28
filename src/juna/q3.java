package juna;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); //  피로도
        int B = sc.nextInt(); //  업무량
        int C = sc.nextInt(); // 줄어드는 피로도
        int M = sc.nextInt(); // 최대 피로도
        sc.close();

        int tired = 0; // 현재 피로도
        int work = 0; // 처리한 업무량

        for (int i = 0; i < 24; i++) {
            if (tired + A <= M) { // 일을 할 수 있으면
                tired += A;
                work += B;
            } else { // 피로도를 초과하면 쉰다
                tired -= C;
                if (tired < 0) tired = 0;
            }
        }

        System.out.println(work);
    }
}
