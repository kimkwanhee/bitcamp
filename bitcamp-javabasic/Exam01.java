//컴파일과 실행

class Exam01 {
    // 모든 자바 코드는 클래스 블록 안에 둔다.
    // class? classification(분류)의 약자이다.
    // 코드를 관리하기 쉽게 분류한다는 의미이다.
    
    // 시작 코드는 main() 블록 안에 둔다.
    public static void main(String[] args) {
        // main()과 같은 블록을 "메서드(method)=함수(function)"라 부른다.
        // 어떤 작업을 처리할 명령어를 묶어둔 블록이다.
        // 메서드 중에서 main()은 자바 프로그램을 실행할 때 
        //  제일 처음 실행하는 블록이다.
        //  이 블록안에 들어 있는 자바 코드를 제일 먼저 실행한다.
        
        // 표준 출력 장치(모니터)로 출력하는 명령어이다.
        System.out.println("Hello, world!");
        System.out.println("Hello world");

    // 1) 컴파일
    //  javac 소스파일명
    // javac Exam01.java
    //  컴파일 후에 생성된 파일명 : 
    //    Exam01.class

    //  컴파일러는 소스 파일을 컴파일할 때 
    //    그 소스 파일이 OS의 기본 인코딩으로 되어 있을 것이라 간주한다. 
    //    만약 소스파일이 OS 기본 문자집합이 아닌 다른 문자집합으로 
    //    인코딩되어 있다면, 컴파일할 때 컴파일러에게 알려줘야 한다.
    //    그래야 제대로 컴파일 할 수 있다.
    //    > javac -encoding 소스파일의문자집합 소스파일명
    //    > javac -encoding UTF-8 Exam01.java

    // 2) 실행
    // > java 클래스명
    // => 실행할 때는 클래스이름을 지정한다.
    // > java Exam01
    
    }
}