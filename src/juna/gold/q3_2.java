package juna.gold;

import java.util.*;

public class q3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        int sum = 0;
        while (list.size() > 1) {

            Integer temp1 = list.poll();
            Integer temp2 = list.poll();
            int number = temp1 + temp2;
            sum += number;
            list.add(number);
        }
        System.out.println(sum);

    }
}
