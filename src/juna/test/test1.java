package juna.test;

import java.util.ArrayList;
import java.util.List;

public class test1 {

    public static void main(String[] args) {
        List<Jewel> list = new ArrayList<>();
        list.add(new Jewel(1, 20000));
        list.add(new Jewel(2, 20000));
        list.add(new Jewel(3, 20000));
        list.add(new Jewel(3, 30000));
        list.add(new Jewel(1, 30000));
        list.sort((x1, x2) -> {
            if (x1.price == x2.price) {
                return x2.weight - x1.weight;
            } else {
                return x2.price - x1.price;
            }
        });

        for (Jewel jewel : list) {
            System.out.println(jewel);
        }
    }
    static class Jewel {
        int weight;
        int price;

        public Jewel(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }

        @Override
        public String toString() {
            return weight + ", " + price;
        }
    }
}
