package juna.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 5)컵홀더 (백준 2810)
 */
public class q1_5 {
    public static void main(String[] args) throws IOException {

        // *S*S*LL*S*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                if (str.charAt(0) == 'S') {
                    cnt++;
                    stack.push('S');
                    continue;
                }else {
                    i++;
                    cnt += 2;
                    stack.push('*');
                    continue;
                }
            }
            char temp = str.charAt(i);
            if (temp == 'L') {
                Character peek = stack.peek();
                if (peek.equals('*')) {
                    stack.push('L');
                } else if (peek.equals('L')) {
                    stack.push('L');
                    stack.push('*');
                    cnt++;
                } else {
                    stack.push('*');
                    stack.push('L');
                    cnt++;
                }
            } else if (temp == 'S') {
                Character peek = stack.peek();
                if (peek.equals('*')) {
                    stack.push('S');
                    stack.push('*');
                    cnt++;
                } else {
                    stack.push('*');
                    stack.push('S');
                    cnt++;
                }
            }

        }

        System.out.println(cnt);


    }
}
