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
                minQ.add(-temp);
            }
        }

        minQ.sort(Comparator.reverseOrder());
        plusQ.sort(Comparator.reverseOrder());


        int max = Math.max(
                plusQ.isEmpty() ? 0 : plusQ.get(0),
                minQ.isEmpty() ? 0 : minQ.get(0)
        );

        int cnt = 0;


        for (int i = 0; i < plusQ.size(); i = i + M) {
            cnt += plusQ.get(i) * 2;
        }

        for (int i = 0; i < minQ.size(); i = i + M) {
            cnt += minQ.get(i) * 2;
        }

        System.out.println(cnt-max);

    }

}
