package loop.ex;

public class WhileForEx3 {
    public static void main(String[] args) {
        // 1~MAX sum
        // My Solution
        /*
        int sum = 0;
        int i = 1;
        int max = 100;
        while(true){
            sum+=i;
            if(i == max){
                System.out.println(sum);
                break;
            }
            i++;
        }
        */
        // Lecture Solution
        int max = 100;
        int sum = 0;
        int i = 1;
        while (i <= max) {
            sum+=i;
            i++;
        }
        System.out.println(sum);

        /*
        int sum2 = 0;
        for (int j = 1; j <= max; j++) {
            sum2 += j;
            if(j == max){
                System.out.println(sum2);
            }
        }
        */
        int sum2 = 0;
        for (int j=1; j<=max; j++) {
            sum2+=j;
        }
        System.out.println(sum2);
    }
}
