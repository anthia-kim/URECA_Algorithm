package baekjoon;

import java.util.Scanner;

public class _10811_바구니뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N+1];

        for (int i = 1; i <= N; i++) { // 초기화
            arr[i] = i;
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();


            int left = a;
            int right = b;

            while(left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
               arr[right] = temp;

                left++;
                right--; // 가운데서 만나야하니까
            }


        }
        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i] + " ");
        }




    } // main
} //class
