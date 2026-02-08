package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number1:");
        int num = scan.nextInt();
        System.out.print("Enter a number2:");
        int num2 = scan.nextInt();

        if(num > num2){
            int temp = num;
            num = num2;
            num2 = temp;
        }
        System.out.print("두 수 사이의 모든 정수:");
        for (int i = num; i < num2; i++) {
            System.out.print(i+", ");
        }
        System.out.println(num2);
    }
}
