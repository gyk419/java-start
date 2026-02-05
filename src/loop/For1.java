package loop;

public class For1 {
    public static void main(String[] args) {

        for(int i=0;i<=10;i++){
            System.out.println(i);
        }

        int sum = 0;
        int endNum = 3;
        for(int j=1;j<=endNum;j++){
            sum += j;
            System.out.println(sum);
        }
    }
}
