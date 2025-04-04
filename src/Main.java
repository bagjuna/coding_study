import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] newA = new int[N];
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i]) {
                    cnt++;
                }
            }
            newA[i] = cnt;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(newA[i]);
        }
    }
}