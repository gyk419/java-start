package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        double avg;

        System.out.println(n+"개의 정수를 입력하세요:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        avg = (double) sum/n;
        System.out.println("입력한 정수의 합계: "+sum);
        System.out.printf("입력한 정수의 평균: %.2f%n", avg); //printf에 대한 자세한 공부는 추후에 계속

    }
}
