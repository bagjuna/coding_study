package juna.test;

import java.util.*;

public class test1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("YYY");
        list.add("BBB");
        list.add("ZZZ");
        list.add("CCC");

        Collections.sort(list);
        int[] a = new int[5];
        System.out.println(a.length);
        System.out.println(true);
        System.out.println(list.size());
    }
}
