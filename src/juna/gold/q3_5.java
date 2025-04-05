package juna.gold;

/**
 * 5) 보석 도둑(백준 1202)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class q3_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  // 보석의 갯수

        int K = Integer.parseInt(st.nextToken());  // 가방의 갯수

        PriorityQueue<Jewel> jewelList = new PriorityQueue<>((x1, x2) -> {
            if (x1.price == x2.price) {
                return x2.weight.compareTo(x1.weight);
            } else {
                return x2.price.compareTo(x1.price);
            }
        });

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            jewelList.add(new Jewel(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken())));

        }


        long sum = 0;
        for (int i = 0; i < K; i++) {
            long bag = Long.parseLong(br.readLine());
            for (Jewel jewel : jewelList) {
                if (jewel.weight <= bag) {
                    jewelList.remove(jewel);
                    sum += jewel.price;
                    break;
                }
            }
        }

        System.out.println(sum);


    }

    static class Jewel {
        Long weight;
        Long price;

        public Jewel(Long weight, Long price) {
            this.weight = weight;
            this.price = price;
        }


    }


}
