//패키지
package step01;
public class Exam01 {
    public static void main(String[] args) {
        System.out.println("src/step01/Exam01");
    }
}
// 클래스들을 관리하기 좋게 분류하는 문법이다.
//  소스 파일에 첫 명령어로 패키지를 선언한다.
//    package 폴더명.폴더명.폴더명;
//    예) package step01.ex.test;
// 패키지에 소속된 클래스 실행하기
// javac -classpath 패키지의위치 패키지명.클래스명
// javac -classpath bin step01.Exam01