package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class _2751_수정렬하기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        // 입력
        for(int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        // 정렬
        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
