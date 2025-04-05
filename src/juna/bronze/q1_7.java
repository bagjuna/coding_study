package juna.bronze;

import java.util.Scanner;

/**
 * 대회 or 인턴 (백준 2875)
 */
public class q1_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 여학생 수
        int M = sc.nextInt();  // 남학생 수
        int K = sc.nextInt();  // 인턴쉽 수

        int cnt = 0;
        // 여행생과 남학생 최대 팀부터 구하기
        while (N > 1 && M > 0) {
            N -= 2;
            M -= 1;
            cnt++;
        }
        // 만약 남아있는 인원이 인턴쉽 갈수 있으면 그냥 정답 출력
        if (N + M > K) {
            System.out.println(cnt);
            return;
        }

        // 남아있는 인원이 인턴쉽가는 인원보다 많다면
        else {
            while (N + M < K) {
                // 남아있는 인원 > 인턴쉽 될때까지
                // 한팀씩 해체시키고 인턴쉽을 가게 한다
                N += 2;
                M += 1;
                cnt--;
            }
            //
            if (cnt < 0) {
                System.out.println(0);
            } else {
                System.out.println(cnt);
            }
        }
    }
}
