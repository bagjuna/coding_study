package juna.package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 13458번 시험 감독 성공
 */
public class q0_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long cnt = N;              // 반드시 long
        int[] test = new int[N];   // 시험장 학생수의 인덱스

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            test[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            test[i] -= A;
        }


        for (int i = 0; i < N; i++) {
            if (test[i] <= 0) {
                continue;
            }

            cnt += test[i] / B;
            if (test[i] % B > 0) {
                cnt++;
            }

        }

        System.out.println(cnt);

    }
}
