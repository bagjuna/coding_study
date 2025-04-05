package juna.bsilver;

// 5원과 2원으로 거스름돈 준다
// cnt = 0;

// 1. N 입력 받는다
// 2. 5 미만일때
// 4. 입력 받은 돈 짝수면 cnt += N / 5
// 5. 입력 받은 돈 홀수면 cnt += N / 5 - 1


import java.util.Scanner;

/**
 * 거스름돈 (백준 14916)
 */
public class q2_0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        if (N < 5) {
            if (N == 2 || N == 4) {
                System.out.println(N / 2);
            } else {
                System.out.println(-1);
            }
            return;
        }
        
        if ((N % 5) == 0) {
            System.out.println(N / 5);
            return;
        }


        // 홀수 일때
        if (N % 2 == 1) {
            if (N >= 5)
                N -= 5; // 출력할 때 cnt + 1해서 출력
            else {
                System.out.println(-1);
            }
            while (N > 0) {
                N -= 2;
                cnt += 1;
            }
            if (cnt > 5) {
                cnt = (cnt / 5) * 2 + cnt % 5;
                System.out.println(cnt + 1);
            } else {
                System.out.println(cnt + 1);
            }


        } else {
            while (N > 0) {
                N -= 2;
                cnt += 1;
            }
            if (cnt > 5) {
                cnt = (cnt / 5) * 2 + cnt % 5;
                System.out.println(cnt);
            } else
                System.out.println(cnt);
        }


    }

}