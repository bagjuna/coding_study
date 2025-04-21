package juna.bsilver;

import java.util.Scanner;

/**
 * 주유소(백준 13305)
 */
public class q_13305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 도시 수
        long[] distance = new long[n - 1]; // 도로 거리
        long[] price = new long[n];        // 주유소 가격

        for (int i = 0; i < n - 1; i++) {
            distance[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextLong();
        }

        long totalCost = 0;
        long minPrice = price[0];

        for (int i = 0; i < n - 1; i++) {
            // 가장 싼 가격으로 거리만큼 주유
            totalCost += minPrice * distance[i];

            // 더 싼 주유소가 나오면 가격 갱신
            if (price[i + 1] < minPrice) {
                minPrice = price[i + 1];
            }
        }


        System.out.println(totalCost);
    }



}
