//리터럴(literal)
package step01;

public class Exam04 {
    public static void main(String[] args) {
        //정수
        //4바이트 정수
        System.out.println(10);
        System.out.println(+10);
        System.out.println(-10);

        //8바이트 크기의 정수
        //숫자 뒤어 1,L을 붙인다.
        System.out.println(10L);
        System.out.println(+10l);
        System.out.println(-10L);

        //부동소수점
        //4바이트
        // 숫자뒤에 F,f를 붙인다.
        System.out.println(3.14F);
        System.out.println(3.14f);
       
        //8바이트 크기
        System.out.println(3.14);
        System.out.println(31.4e-1);

        

        //문자열
        System.out.println("오오오");

        //한개의 문자
        System.out.println('가');

        //논리 값
        System.out.println(true);
        System.out.println(false);                              
    }
}

// 자바 코드로 값을 표현한 것