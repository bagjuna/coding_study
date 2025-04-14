package juna.bsilver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class q_1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력 예: "XX.XX" 혹은 "XXXX....XXX.....XX" 등
        String board = br.readLine();
        int N = board.length();

        // 각 구간(연속된 'X'나 '.'를 분리) 저장할 리스트
        List<String> segments = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        //
        for (int i = 0; i < N; i++) {
            char c = board.charAt(i);
            if (c == 'X') {
                // 'X'는 현재 구간에 계속 추가
                current.append(c);
            } else { // '.'인 경우
                // 만약 지금까지 누적한 current에 'X'들이 있다면,
                // 그 구간을 segments에 추가하고 초기화
                if (!current.isEmpty()) {
                    segments.add(current.toString());
                    current = new StringBuilder();
                }
                // '.'은 각각 별도의 구간으로 추가
                segments.add(String.valueOf(c));
            }
        }

        if (current.length() > 0) {
            segments.add(current.toString());
        }
        StringBuilder result = new StringBuilder();
        for (String segment : segments) {
            // 구간이 '.'이면 그대로 결과에 붙임.
            if (segment.equals(".")) {
                result.append(".");
            } else { // 구간이 'X'들로 이루어진 경우
                int count = segment.length();
                // 만약 연속된 X의 개수가 홀수이면 덮을 수 없음.
                if (count % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
                // 우선 4개짜리 폴리오미노("AAAA")를 최대한 많이 사용
                int numAAAA = count / 4;
                // 남은 X의 수는 count % 4 (이 값은 0 또는 2가 됨)
                int numBB = (count % 4) / 2;

                for (int i = 0; i < numAAAA; i++) {
                    result.append("AAAA");
                }
                for (int i = 0; i < numBB; i++) {
                    result.append("BB");
                }
            }
        }

        // 최종 결과 출력
        System.out.println(result);
    }
}
