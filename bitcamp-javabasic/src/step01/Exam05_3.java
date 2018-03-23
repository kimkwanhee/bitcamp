//정수의 리터럴 - 크기
package step01;

public class Exam05_3 {
    public static void main(String[] args) {
        //정수를 표기할 때
        //크기에 따라 표기방법이 다르다.
        //그냥 작성시 4바이트 크기의 정수를 표시한다.
        System.out.println(2147483647); //4바이트 양의 정수
        System.out.println(-214783648); //4바이트 음의 정수

        //4바이트 초과하면 컴파일 오류이다.
        //숫자가 증가하면 4바이트 메모리가 넘치기 때문이다.
        System.out.println(2147483647); 
        System.out.println(-214783648); 

        //해결방법
        //4바이트 메모리보다 더큰 메모리숫자로 저장하라고 명령을 내린다.
        //숫자 뒤에 L,l을 추가한다.
        //숫자1과 헷갈리지 않기위해 대문자를 쓴다.
        System.out.println(2147483648L); 
        System.out.println(-214783649L);

        //8바이트 최소값 및 최대값 출력
        //자바는 각 데이터 유형에 따라 최대/최소 값을 알아 볼 수 있는 
        //있는 특별한 명령어를 제공한다.
        System.out.println(Integer.MAX_VALUE); //4바이트로 표현 할 수 있는 정수 최대값
        System.out.println(Integer.MIN_VALUE); //4바이트로 표현 할 수 있는 정수 최소값
        System.out.println(Long.MAX_VALUE); //8바이트로 표현 할 수 있는 정수 최대값
        System.out.println(Long.MIN_VALUE); //8바이트로 표현 할 수 있는 정수 최소값

        //따라서 다음은 크기가 다른 정수이다.
        System.out.println(100); //4바이트 크기의 정수 값
        System.out.println(100L); //8바이트 크기의 정수 값
       
    }
}
