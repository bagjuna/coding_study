package juna.package2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 18)주식 (백준 11501)
 */
public class q2_18 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array;
        int[] maxarray;
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            List<Integer> moneys = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            array = new int[n];
            maxarray = new int[n];
            for (int j = 0; j < n; j++) {
                int temp = Integer.parseInt(st.nextToken());
                array[j] = temp;
            }
            for (int j = 1; j < n; j++) {
                int max = 0;
                if (max > array[j]) {

                }
            }
            for (int j = 0; j < n; j++) {
                int temp = array[j];
            }

        }
    }

}
