package juna.package2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 15)DNA (백준 1969)
 */
public class q2_15 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int cnt = 0;

        int N = Integer.parseInt(str[0]);
        int length = Integer.parseInt(str[1]);
        String[] DNAS = new String[N];
        for (int i = 0; i < N; i++) {
            DNAS[i] = br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            HashMap<Character, Integer> map = new HashMap();
            for (int j = 0; j < N; j++) {
                char temp = DNAS[j].charAt(i);
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                }
                else {
                    map.put(temp, 1);
                }
            }
            char maxChar = 0;

            List<Character> keySet = new ArrayList<>(map.keySet());
            Collections.sort(keySet);

            int max = 0;
            for (Character c : keySet) {
                Integer temp = map.get(c);
                if (max < temp) {
                    maxChar = c;
                    max = temp;
                }
            }
            sb.append(maxChar);
            cnt += (N - max);

        }


        System.out.println(sb);
        System.out.println(cnt);
    }


}
