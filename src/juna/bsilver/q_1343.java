package juna.bsilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class q_1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] line = br.readLine().toCharArray();
        int N = line.length;
        List<String> list = new ArrayList<>();
        StringBuilder temp = new StringBuilder(" ");
        list.add(" ");
        for (int i = 0; i < N; i++) {
            if (line[i] == '.') {
                if (temp.toString().contains(".")) {
                    temp.append(".");
                    continue;
                }else {

                }
                list.add(".");
                temp = new StringBuilder("");

            } else {
                temp.append(line[i]);
            }
        }
        list.add(String.valueOf(temp));
        StringBuilder result = new StringBuilder("");
        for (String s : list) {
            System.out.println(s);
            int n = s.length();
            if (s.contains(".")) {
                continue;
            }

        }
    }
}
