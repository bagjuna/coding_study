package juna.package3;

import java.util.*;

/**
 * 강의실 배정하기 (백준 11000)
 */

public class q3_0 {

    static List<Room> list = new ArrayList<>();
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            list.add(new Room(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(list,
                (o1, o2) -> {
                    if (o1.start == o2.start) {
                        return o1.end - o2.end;
                    } else return o1.start - o2.start;
                });
        queue.add(list.get(0).end);
        for (int i = 1; i < N; i++) {
            //강의실 끝나는 시간 ≤ 현 강의 시작 시간일 때
            if (list.get(i).start >= queue.peek())
                queue.poll();
            //강의실 추가 배정
            queue.add(list.get(i).end);
        }

        System.out.println(queue.size());
    }

    // 방의 객체
    static class Room {
        int start;   // 시작 시간
        int end;    // 끝나는 시간

        public Room(int start, int end) {
            this.start = start;
            this.end = end;
        }


    }

}
