package operator;

public class Operator2 {
    public static void main(String[] args) {
        String result1 = "hello" + " world";
        System.out.println(result1);

        String result2 = "a + b = " + 10;
        System.out.println(result2);

        int num = 20;
        String str = "a + b = ";
        String result3 = str + num;
        System.out.println(result3);

        // 자바에서 문자와 숫자를 더하면 숫자를 문자열로 변경한 다음 서로 더한다.
    }
}
