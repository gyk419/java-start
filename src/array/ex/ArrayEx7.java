package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] subject = new String[]{"국어", "영어", "수학"};

        System.out.print("학생수를 입력하세요:");
        int studentNum = sc.nextInt();

        int[][] score = new int[studentNum][subject.length];

        for (int i=0; i<studentNum; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < subject.length; j++) {
                System.out.print(subject[j] + " 점수:");
                score[i][j] = sc.nextInt();
            }
        }


        for (int i=0; i<score.length; i++) {
            int sum = 0;
            for (int j=0; j<score[i].length; j++) {
                sum += score[i][j];
            }
            double avg = (double) sum/subject.length;
            System.out.println((i+1)+"번 학생의 총점: "+sum+", 평균: "+avg);
        }
    }
}
