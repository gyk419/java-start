package array;

public class Array1 {
    public static void main(String[] args) {

        int[] students;
        students = new int[5];
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("student1 = " + students[0]);
        System.out.println("student2 = " + students[1]);
        System.out.println("student3 = " + students[2]);
        System.out.println("student4 = " + students[3]);
        System.out.println("student5 = " + students[4]);

        //자바는 배열을 생성할 때 그 내부값을 자동으로 초기화 -> 숫자는 0, boolean은 false, String은 null

        System.out.println(students); // [I 는 int형 배열을 뜻한다. @뒤에 16진수는 참조값을 뜻한다.

    }
}
