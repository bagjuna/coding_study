package juna.bsilver;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 모두의 마블 (백준 12845)
 */
public class q2_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gold = 0;
        int level = 0;
        int N = sc.nextInt();
        List<Integer> cards = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            cards.add(sc.nextInt());
        }
        Integer first = cards.stream().max(Comparator.naturalOrder()).orElse(0);
        cards.remove(first);
        level = first;
        for (int i = 0; i < N-1; i++) {
            Integer temp = cards.get(0);
            cards.remove(temp);
            gold += level;
            gold += temp;
        }

        System.out.println(gold);


    }
}
