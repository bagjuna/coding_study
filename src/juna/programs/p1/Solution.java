package juna.programs.p1;

import java.awt.print.Book;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"124", "123", "1235", "567", "88"}));
    }

    public static boolean solution(String[] phone_book) {

        Set<String> set = new HashSet<>();
        for (String s : phone_book) {
            set.add(s);
        }

        for (String s : set) {
            for (int i = 0; i < s.length(); i++) {
                String temp = s.substring(0, i);
                if (set.contains(temp)) {
                    return false;
                }
            }
        }

        return true;


    }
}
//테스트 1 〉	통과 (3.10ms, 60.2MB)
//테스트 2 〉	통과 (3.01ms, 58.3MB)
//테스트 3 〉	통과 (324.03ms, 228MB)
//테스트 4 〉	통과 (342.19ms, 194MB)