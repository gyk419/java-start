package loop.ex;

public class WhileForEx2 {
    public static void main(String[] args) {
        // My Solution
        /*int num= 1;
        while (num<=20) {
            if(num%2==0) {
                System.out.println(num);
            }
            num++;
        }

        for(int num2=1;num2<=20;num2++) {
            if(num2%2==0) {
                System.out.println(num2);
            }
        }*/

        // Lecture Solution
        int num = 2;
        int count = 1;
        while(count <=10){
            System.out.println(num);
            num+=2;
            count++;
        }

        /*for(int num2=2, count2 = 1;count2<=10;num2+=2, count2++){
            System.out.println(num2);
        }*/
        // 위 코드 가능은 하지만 선호하지 않음.

        int num2 = 2;
        for(int count2=1;count2<=10;count2++){
            System.out.println(num2);
            num2+=2;
        }
    }
}
