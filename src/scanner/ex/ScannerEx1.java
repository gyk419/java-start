package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요:");
        String str = scan.nextLine();

        System.out.print("당신의 나이를 입력하세요:");
        int num = scan.nextInt();

        System.out.println("당신의 이름은 "+str+"이고, 나이는 "+num+"살입니다.");
    }
}
