package dev;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj_11729 {
    static int answer = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        moveHanoii(3, 1, 2, 3);
        System.out.println(sb);
    }

    public static void moveHanoii(int cnt, int from, int by, int to) {
        answer++;
        if (cnt == 1) sb.append(from + " " + to + "\n");

        else {
            moveHanoii(cnt - 1, from, by, to);
            sb.append(from + " " + to + "\n");
            moveHanoii(cnt - 1, by, from, to);
        }
    }
}
