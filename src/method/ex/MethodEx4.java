package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0; //잔액

        while(true){
            System.out.println("-----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.print("선택: ");
            int option = scanner.nextInt();
            if(option==1){
                System.out.print("입금액을 입력하세요: ");
                int amount = scanner.nextInt();
                balance += amount;
                System.out.println(amount+"원을 입금하였습니다. 현재잔액: "+balance);
            }
            else if(option==2){
                System.out.print("출금액을 입력하세요: ");
                int amount = scanner.nextInt();
                if(balance>=amount){
                    balance -= amount;
                    System.out.println(amount+"원을 출금하였습니다. 현재잔액: "+balance);
                } else{
                    System.out.println(amount+"원을 출금하려 했으나 잔액이 부족합니다.");
                }
            }
            else if(option==3){
                System.out.println("현재잔액: "+balance);
            }
            else if(option==4){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("옵션을 잘못 입력하셨습니다.");
            }
        }
    }
    //원래는 메서드 만들어서 푸는 조건이지만 많이 해봐서 메서드 없이 만들어보았다.
}
