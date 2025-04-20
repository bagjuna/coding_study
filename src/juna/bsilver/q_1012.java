package juna.bsilver;

import java.util.*;

public class q_1012 {

    static int[][] array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int K = sc.nextInt();
            array = new int[M][N];

            for (int j = 0; j < K; j++) {
                array[sc.nextInt()][sc.nextInt()] = 1;
            }

            

        }
        
    }
}

