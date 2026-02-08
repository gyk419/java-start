package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println(n+"개의 정수를 입력하세요:");
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){max=arr[i];}
            if(arr[i]<min){min=arr[i];}
        }


        System.out.println("가장 작은 정수: "+min);
        System.out.println("가장 큰 정수: "+max);
    }
}
