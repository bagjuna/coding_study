package juna.bronze;

import java.util.Scanner;

public class q_1592 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        int array[] = new int[N];
        int cnt = 0;
        int index = 0;
        int temp = 0;
        while (true) {
            array[index]++;
            temp = array[index];
            if (temp >= M) {
                break;
            }
            index = (index + L) % (N);
            cnt++;
        }
        System.out.println(cnt);

    }
}
