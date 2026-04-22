package baekjoon;

import java.util.Scanner;

import java.util.Scanner;

public class _1244_스위치켜고끄기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] switches = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            switches[i] = sc.nextInt();
        }

        int studentCount = sc.nextInt();

        for (int i = 0; i < studentCount; i++) {
            int gender = sc.nextInt();
            int number = sc.nextInt();

            if (gender == 1) {
                for (int j = number; j <= n; j += number) {
                    change(switches, j);
                }
            } else if (gender == 2) {
                change(switches, number);

                int left = number - 1;
                int right = number + 1;

                while (left >= 1 && right <= n) {
                    if (switches[left] == switches[right]) {
                        change(switches, left);
                        change(switches, right);
                        left--;
                        right++;
                    } else {
                        break;
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(switches[i] + " ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }

    static void change(int[] switches, int idx) {
        if (switches[idx] == 0) {
            switches[idx] = 1;
        } else {
            switches[idx] = 0;
        }
    }
}