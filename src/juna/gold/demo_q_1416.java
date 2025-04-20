package juna.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class demo_q_1416 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  // 운반해야 하는 책의 갯수
        int M = Integer.parseInt(st.nextToken());  // 들 수 있는 책의 갯수
        int sum = 0;

        List<Integer> plusQ = new ArrayList<>();
        List<Integer> minQ = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp > 0) {
                plusQ.add(temp);
            }else {
                minQ.add(temp);
            }
        }

        Collections.sort(plusQ);
        Collections.sort(minQ,Collections.reverseOrder());


        System.out.println(plusQ);
        System.out.println(minQ);

        while (!plusQ.isEmpty() || !minQ.isEmpty()) {
            for (int i = 0; i < M; i++) {
                Integer remove = plusQ.remove(0);
                System.out.println(remove);
                sum += remove*2;

            }
            for (int i = 0; i < M; i++) {
                sum -= minQ.remove(0);
            }
        }

        System.out.println(sum);

    }
}
