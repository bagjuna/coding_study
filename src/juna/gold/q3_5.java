package juna.gold;

/**
 * 5) 보석 도둑(백준 1202)
 */
import java.io.*;
import java.util.*;

public class q3_5 {
    static class Jewel {
        int weight;
        int price;

        public Jewel(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  // 보석 개수
        int K = Integer.parseInt(st.nextToken());  // 가방 개수

        Jewel[] jewels = new Jewel[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            jewels[i] = new Jewel(m, v);
        }

        int[] bags = new int[K];
        for (int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }

        // 보석 무게 오름차순 정렬 (같은 무게면 가격 내림차순)
        Arrays.sort(jewels, (a, b) -> a.weight == b.weight ? b.price - a.price : a.weight - b.weight);

        // 가방 무게 오름차순 정렬
        Arrays.sort(bags);

        // 가격 최대 힙
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        long sum = 0;
        int j = 0;
        for (int i = 0; i < K; i++) {
            int bagCapacity = bags[i];

            // 현재 가방에 들어갈 수 있는 보석들을 힙에 추가
            while (j < N && jewels[j].weight <= bagCapacity) {
                maxHeap.add(jewels[j].price);
                j++;
            }

            // 가장 비싼 보석을 가져감
            if (!maxHeap.isEmpty()) {
                sum += maxHeap.poll();
            }
        }

        System.out.println(sum);
    }
}