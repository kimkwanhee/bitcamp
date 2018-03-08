package step03.assignment;

import java.util.Scanner;

public class Test01 {
    public static void  main(String[] args) {
        java.util.Scanner keysScan = new java.util.Scanner(System.in);

        step03.Score[] scores = new step03.Score[3];

       for(int i = 0; i < scores.length; i++) {
           scores[i] = new step03.Score();

        System.out.print("입력: ");
       scores[i].name = keysScan.next();
       scores[i].kor = keysScan.nextInt();
       scores[i].eng = keysScan.nextInt();
       scores[i].math = keysScan.nextInt();
       scores[i].sum = scores[i].kor + scores[i].eng + scores[i].math;
       scores[i].aver = scores[i].sum / 3;
        
    }

    System.out.println("--------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%s %3d %3d %3d %3d %5.1f\n", 
                scores[i].name, 
                scores[i].kor, scores[i].eng, scores[i].math,
                scores[i].sum, scores[i].aver);
        }

    }
}