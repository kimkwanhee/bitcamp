//클래스 - 사용후
package step03;

public class Exam02 {
    public static void main(String[] args) {
        class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;
        }

        //확보된 메모리를 사용하려면 주소를 보관시킬 필요가 있다.
        Score[]arr = new Score[3];
        
        s = new Score();

        s.name = "홍길동";
        s.kor = 100;
        s.eng = 90;
        s.math = 80;
        s.sum = s.kor + s.eng + s.math;
        s.aver = s.sum / 3;

        System.out.printf("이름 : %s\n", s.name);
        System.out.printf("국어 : %d\n", s.kor);
        System.out.printf("영어 : %d\n", s.eng);
        System.out.printf("수학 : %d\n", s.math);
        System.out.printf("합계 : %d\n", s.sum);
        System.out.printf("평균 : %1f\n", s.aver);

    }
}