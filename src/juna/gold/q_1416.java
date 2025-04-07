package juna.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class q_1416 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        List<Integer> plusQ = new ArrayList<>();
        List<Integer> minQ = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            Integer temp = Integer.valueOf(st.nextToken());
            if (temp > 0) {
                plusQ.add(temp);
            } else {
                minQ.add(temp);
            }
        }

        minQ.sort(Comparator.reverseOrder());
        plusQ.sort(Comparator.naturalOrder());

        int cnt = 0;

        int plus = 0;
        if (minQ.size() > M) {
            for (int i = plusQ.size() - 1; i > plusQ.size() - M - 1; i--) {
                plus += plusQ.get(i);
            }
        }


        int min = 0;
        if (minQ.size() > M) {
            for (int i = minQ.size() - 1; i > minQ.size() - M - 1; i--) {
                min += minQ.get(i);
            }
        }


        if (plus > -min) {
            cnt += plusQ.remove(plusQ.size() - 1);
            for (int i = 0; i < M - 1; i++) {
                plusQ.remove(plusQ.size() - 1);
            }
        } else {
            cnt -= minQ.remove(minQ.size() - 1);
            for (int i = 0; i < M - 1; i++) {
                minQ.remove(minQ.size() - 1);
            }
        }
        System.out.println(minQ);

        System.out.println("cnt = " + cnt);

        while (plusQ.size() > M) {
            cnt += 2 * (plusQ.remove(plusQ.size() - 1));
            for (int i = 0; i < M - 1; i++) {
                plusQ.remove(plusQ.size() - 1);
            }
        }

        System.out.println("plusQ.size = " + plusQ.size());

        if (plusQ.size() > 0) {
            cnt += 2 * plusQ.remove(plusQ.size() - 1);
        }

        while (minQ.size() > M) {
            cnt -= 2 * (minQ.remove(minQ.size() - 1));
            for (int i = 0; i < M - 1; i++) {
                minQ.remove(minQ.size() - 1);
            }
        }
        System.out.println("minQ.size() = " + minQ.size());

        if (minQ.size() > 0) {
            cnt -= 2 * (minQ.remove(minQ.size() - 1));
        }

        System.out.println(cnt);

    }

}
