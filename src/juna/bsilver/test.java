package juna.bsilver;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        boolean flag = true;

// 여러 연산자 조합
        int result = x++ + --y * (flag ? 2 : 1);
        System.out.println("계산 결과: " + result); // 18
        System.out.println("x의 최종값: " + x); // 11

        int j = 0;
        int[] arr = new int[3];

        arr[j++] = j;
        System.out.println(arr[0]);

    }
}
