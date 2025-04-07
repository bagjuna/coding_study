package juna.bsilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 23)2+1세일 (백준 11508)
 */
public class q2_23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }

        list.sort(Comparator.naturalOrder());

        while (list.size() > 2) {
            int num1 = list.remove(list.size()-1);
            int num2 = list.remove(list.size()-1);
            list.remove(list.size()-1);
            cnt += num1;
            cnt += num2;
        }

        while (list.size() > 0) {
            cnt += list.remove(list.size()-1);
        }

        System.out.println(cnt);

    }

}
