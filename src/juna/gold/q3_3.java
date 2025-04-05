package juna.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 단어 수학 (백준 1339)
 */
public class q3_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<StringBuilder> list = new ArrayList<>();
        int cnt = 9;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            list.add(new StringBuilder(br.readLine()));
        }
        while (list.get(0).length() > 1) {

        }

    }

    static class Word{
        int length = 0;
        StringBuilder alpa;

        public Word(String alpa) {
            this.alpa = new StringBuilder(alpa);
            length = alpa.length();
        }

        public Word(StringBuilder sb) {
            this.alpa = sb;
            this.length = alpa.length();
        }
    }
}
