package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _1181_단어정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        // 입력
        for(int i = 0; i < N; i++) {
            list.add(sc.next());
        }
        // 정렬
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if(a.length() == b.length()) {
                    return a.compareTo(b);
                }
                return a.length() - b.length();
            }
        });
        // 첫번째꺼 출력
        System.out.println(list.get(0));

        // 중복 제거 후 출력
        for (int i = 1; i < N; i++) {
            if(!list.get(i).equals(list.get(i-1))){
                System.out.println(list.get(i));

            }
        }
    }
}
