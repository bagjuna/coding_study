package juna.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 센서 (백준 2212)
 */
public class q3_6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        if (K > N) {
            System.out.println(0);
            return;
        }
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        list.sort(Comparator.naturalOrder());
        for (int i = 0; i < N - 1; i++) {
            int temp1 = list.get(i);
            int temp2 = list.get(i + 1);
            list2.add(temp2 - temp1);
        }

        list2.sort(Comparator.reverseOrder());

        for (int i = 0; i < K - 1; i++) {
            list2.remove(0);
        }

        int sum = 0;
        for (Integer i : list2) {
            sum += i;
        }
        System.out.println(sum);

    }


}
