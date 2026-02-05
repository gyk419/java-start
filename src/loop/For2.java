package loop;

public class For2 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        for (; ; ) {
            sum += i;
            if(sum >10){
                System.out.println(sum);
                break;
            }
            i++;
        }

        int sum2=0;
        for(int j =1; ; j++){
            sum2+=j;
            if(sum2>10){
                System.out.println(sum2);
                break;
            }
        }
    }
}
