package method;

public class Method1 {
    public static void main(String[] args) {
        int sum1 = add(1,4);
        System.out.println(sum1);

        int sum2 = add(10,40 );
        System.out.println(sum2);
    }

    //add 메서드
    public static int add(int a, int b) {
        System.out.println(a+" + "+b+" 연산수행");
        int sum = a+b;
        return sum;
    }

    //호출에서 넘기는 값을 인수 또는 인자(Argument)
    //메서드(함수)를 정의할 때 선언한 변수를 매개변수, 파라미터라 한다.
    //메서드를 호출할 때 인수를 넘기면, 그 인수가 매개변수에 대입된다.
}
