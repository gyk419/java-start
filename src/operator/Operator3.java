package operator;

public class Operator3 {
    public static void main(String[] args) {
        /* 연산자 우선순위 암기법
        1. 상식선에서 우선순위를 사용하자
        2. 애매하면 괄호를 사용하자
        3. 필요하다면 우선순위 검색하면 된다
        */

        //증감 연산자
        int a = 1;
        ++a;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);

        //전위 증감 연산자
        int A = 1;
        int B = 0;
        B = ++A;
        System.out.println("A = " + A + ", B = " + B);

        //후위 증감 연산자
        A = 1;
        B = 0;
        B = A++;
        System.out.println("A = " + A + ", B = " + B);

    }
}
