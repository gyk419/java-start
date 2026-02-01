package operator;

public class Operator4 {
    public static void main(String[] args) {
        //비교 연산
        int a= 2;
        int b= 3;

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        boolean result = a == b;
        System.out.println(result);

        //문자열 비교 ( .equals() 자세한 내용은 추후에 다룸 )
        String str1 = "문자열1";
        String str2 = "문자열2";
        boolean result2 = "hello".equals("hello"); //리터럴 비교
        boolean result3 = str1.equals("문자열1"); //문자열 변수, 리터럴 비교
        boolean result4 = str1.equals(str2); //문자열 변수 비교
        System.out.println("restulr2 = " + result2);
        System.out.println("restulr3 = " + result3);
        System.out.println("restulr4 = " + result4);

        System.out.println("hello" == "hello");

        //논리 연산 && || !
        //대입 연산 =
        //축약(복합) 대입 연산 += -= %= /= *=
    }
}
