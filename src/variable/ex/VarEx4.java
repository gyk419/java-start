package variable.ex;

public class VarEx4 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        
        double var1 = 1.5;
        double var2 = 2.5;
        double var3 = 3.5;
        
        double sum2 = var1 + var2 + var3;
        double average2 = sum2 / 3;
        System.out.println("sum2 = " + sum2);
        System.out.println("average2 = " + average2);

        int score = 80;
        boolean result3 = score >= 80 && score <= 100;
        System.out.println("result3 = " + result3);

        if (score >= 80 && score <=100 ){
            System.out.println(true);
        }
    }
}
