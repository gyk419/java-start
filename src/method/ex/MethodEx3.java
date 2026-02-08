package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
        balance= deposit(balance, 500);
        balance= withdraw(balance, 200);
        System.out.println("balance = " + balance);
    }

    public static int deposit(int balance, int a){
        balance += a;
        System.out.println(a+"원을 입금하였습니다. 현재 잔액: "+ balance+"원");
        return balance;
    }
    public static int withdraw(int balance, int a){
        if(balance>=a) {
            balance -= a;
            System.out.println(a + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        }else {
            System.out.println(a+"원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
